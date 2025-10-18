package array1;

public class Array1D {

    public String getArrayInfo(int[] arr) {
        StringBuilder result = new StringBuilder();
        int sum = 0;

        // Tambahkan semua elemen array ke string
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            sum += arr[i];

            // Tambahkan spasi setelah setiap elemen kecuali yang terakhir
            if (i < arr.length - 1) {
                result.append(" ");
            }
        }

        // Tambahkan baris baru dan total jumlah
        result.append("\nSum: ").append(sum);

        return result.toString();
    }
}
