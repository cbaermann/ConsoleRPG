package com;

public interface HashProvider<K> {
    int hashKey(K key, int tableSize);
}
