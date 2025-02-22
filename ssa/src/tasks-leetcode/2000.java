class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        boolean b = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ch)
            {
                index = i;
                b = true;
                break;
            }
        }
        if (b)
        {
            int beg = 0;
            while(beg <= index)
            {
                char temp = arr[beg];
                arr[beg] = arr[index];
                arr[index] = temp;
                beg++;
                index--;
            }
        }
        return String.valueOf(arr);
    }
}