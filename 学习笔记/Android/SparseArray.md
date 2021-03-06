# SparseArray

### 选择合适的数据结构

元素个数多，或增删频繁使用

`HashMap` 查询接近O(1)，插入接近O(1)，2倍扩容，无缩容机制，额外的Entry对象

否则使用

`ArrayMap` 查询O(logN)，插入O(logN)，1.5倍扩容，0.5倍缩容，无额外的对象开销，小数组复用池

若为Key为整型则应使用

`SparseArray`

如果存放的是基本类型，还可以使用

`SparseIntArray `，`SparseBooleanArray` 等

### 源码思路

- 使用二分查找，时间复杂度为O(LogN)

- 采用了延迟删除的机制，通过将删除KEY的Value设置为空对象，方便之后对该下标的存储进行复用

- 频繁删除将不会触发GC，导致size远大于有效数组长度，造成性能损耗


### 核心

避免自动装箱，不需要开辟内存空间来额外存储外部映射

仅提高内存效率，而不是提高执行效率

