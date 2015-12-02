class EndlessArray {
	private Object[] Arr;
	public void add(Object) {
		if (Arr[] == null) {
			Object Arr1[] = new Object[Arr.length + 1];
			for (int i = 0; i < Arr.length; i++) {
				Arr1[i] = Arr[i];
			}
			Arr1[Arr.length] = obj;
			Arr = Arr1;

		}
		else {
			Arr = new Object[1];
            Arr[0] = obj;
		}
	}
	public void delete(int i) {
		if ((i >= 0) && (i <= Arr.length)) {
			Arr[i] = null;
		}
	}
	public Object get(int i){
        if ((i >= 0) && (i < Arr.length)){
            return Arr[i];
        }
        else{
            return null;
        }
    }

}