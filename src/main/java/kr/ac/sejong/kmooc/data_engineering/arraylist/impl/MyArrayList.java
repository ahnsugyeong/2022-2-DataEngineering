package kr.ac.sejong.kmooc.data_engineering.arraylist.impl;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {

	private Object[] data;

	public MyArrayList() {
		data = new Object[0];
	}

	@Override
	public String toString() {
		if (data.length == 0)
			return "[]";

		String result = "[";
		result += data[0];
		for (int i = 1; i < data.length; i++) {
			result += ", " + data[i];
		}
		result += "]";
		return result;

	}

	@Override
	public int size() {
		return data.length;
	}

	@Override
	public boolean isEmpty() {
		if (data == null || data.length == 0)
			return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (Object value : data) {
			if (value.equals(o))
				return true;
		}

		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyArrayListListIterator<E>(data, 0);
	}

	@Override
	public Object[] toArray() {
		return data;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		if (a.length < data.length) {
			a = (T[]) Array.newInstance(a.getClass().componentType(), data.length);
			for (int i = 0; i < data.length; i++) {
				a[i] = (T) data[i];
			}
		}
		return a;
	}

	@Override
	public boolean add(E e) {
		// 1. 현재보다 크기가 1개 더 큰 배열 생성
		Object[] newData = new Object[data.length + 1];

		// 2. 현재의 데이터 복사
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}

		// 3. 마지막에 e 추가
		newData[newData.length - 1] = e;

		// 4. newData가 Data가 되게 참조
		data = newData;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		int ri = indexOf(o);
		if (ri == -1)
			return false;
		// ri가 지워야 할 index
		Object[] newData = new Object[data.length - 1];
		for (int i = 0; i < ri; i++) {
			newData[i] = data[i];
		}
		for (int i = ri + 1; i < data.length; i++) {
			newData[i - 1] = data[i];
		}
		data = newData;
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		data = new Object[0];
	}

	@Override
	public E get(int index) {
		if (index >= data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);
		return (E) data[index];
	}

	@Override
	public E set(int index, E element) {
		if (index >= data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);

		E previous = (E) data[index];
		data[index] = element;

		return previous;
	}

	@Override
	public void add(int index, E element) {
		if (index > data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);
		// 1. 크기가 1개 더 큰 Object[] 생성
		Object[] newData = new Object[data.length + 1];

		// 2. 기존의 data를 index 전까지 복사
		for (int i = 0; i < index; i++) {
			newData[i] = data[i];
		}

		// 3. index에 새로운 element 추가
		newData[index] = element;

		// 4. 나머지 data를 index 다음부터 복사
		for (int i = index; i < data.length; i++) {
			newData[i + 1] = data[i];
		}

		// 5. data = newData
		data = newData;
	}

	@Override
	public E remove(int index) {
		if (index >= data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);
		E previous = (E) data[index];

		Object[] newData = new Object[data.length - 1];
		for (int i = 0; i < index; i++) {
			newData[i] = data[i];
		}
		for (int i = index + 1; i < data.length; i++) {
			newData[i - 1] = data[i];
		}
		data = newData;

		return previous;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(o))
				return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		for (int i = data.length - 1; i >= 0; i--) {
			if (data[i].equals(o))
				return i;
		}
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new MyArrayListListIterator<E>(data, 0);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new MyArrayListListIterator<E>(data, index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
