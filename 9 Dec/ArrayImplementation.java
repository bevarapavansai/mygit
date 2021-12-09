package com.technoelevate.scannerclass;

	import java.util.Iterator;

	public class ArrayImplementation<E> implements Iterable{

		private Object[] obj;
		private int position;
		
		public ArrayImplementation(int size) {
			this.obj=new Object[size];
		}
		
		public void addElement(Object obj) {
			if(this.position>=this.getSize()) {
				grow();
			}
			this.obj[position]=obj;
			position++;
		}
		public Object getspecificElement(int index) {
			return this.obj[index];
		}
		
		public void getAllElement() {
			for(Object ob:this.obj) {
				System.out.print(ob+" ,");
			}
		}
		public void replace(int index,Object ob) {
			for(int i=0;i<this.getSize();i++) {
				if(i==index) {
					this.obj[i]=ob;
				}
			}
		}
		public void remove(int index) {
			Object [] temp=new Object[this.getSize()];
			for(int i=0;i<this.getSize();i++) {
				if(i!=index) {
					temp[i]=this.obj[i];
				}
			}
			this.obj=temp;
		}
		private Object[] grow() {
			// TODO Auto-generated method stub
			Object [] temp=this.obj;
			this.obj=new Object[this.getSize()*2];
			for(int i=0;i<temp.length;i++) {
				this.obj[i]=temp[i];
			}
			return this.obj;
		}

		public int getSize() {
			return this.obj.length;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return new myiterable();
		}

		private class myiterable implements Iterator<E>{

			public int cursor=0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cursor<position?true:false; 
			}
			@Override
			public E next() {
				// TODO Auto-generated method stub
				return (E) obj[cursor++];
			}

		}
	}


