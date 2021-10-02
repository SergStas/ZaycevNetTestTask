public static int[] decryptData(int[] price, int discount, int offset, int readLength) {
    if (price == null || offset < 0 || offset > price.length)
        return null;

    if (discount < 1 || discount > 99)
        return null;

    if (readLength < 1 || offset + readLength > price.length)
        return null;

    return Arrays.stream(price).skip(offset).limit(readLength).map(x -> x * (100 - discount) / 100).toArray();
}