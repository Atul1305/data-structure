package com.quest.data.structure.lru_cache.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	final Node head = new Node();
	final Node tail = new Node();
	Map<Integer, Node> nodeMap;
	int cacheCapacity;

	public LRUCache(int capacity) {
		this.nodeMap = new HashMap<>(capacity);
		this.cacheCapacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		int result = -1;
		Node node = nodeMap.get(key);
		if(node != null) {
			result = node.value;
			remove(node);
			add(node);
		}
		return result;
	}

	public void put(int key, int value) {
		Node node = nodeMap.get(key);
		if (node != null) {
			remove(node);
			node.value = value;
			add(node);
		} else {
			if (nodeMap.size() == cacheCapacity) {
				nodeMap.remove(node.prev.key);
				remove(node);
			}

			Node newNode = new Node();
			newNode.key = key;
			newNode.value = value;

			nodeMap.put(key, newNode);
			add(newNode);
		}
	}

	public void add(Node node) {
		Node headNext = head.next;
		head.next = node;
		node.prev = head;
		node.next = headNext;
		headNext.prev = node;
	}

	public void remove(Node node) {
		Node nextNode = node.next;
		Node prevNode = node.prev;

		nextNode.prev = prevNode;
		prevNode.next = nextNode;
	}

	class Node {
		int key;
		int value;
		Node prev;
		Node next;
	}
}
