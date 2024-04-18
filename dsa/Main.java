package dsa;

class Main {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","fly"};
        LongestPrefixStringArray longestPrefixStringArray = new LongestPrefixStringArray();
        String res = longestPrefixStringArray.prefix(strings);
        System.out.println(res);

    }
}
