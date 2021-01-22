public class Try8 {
    // Демонстрация сохранения табличных данных в двумерном массиве
    public static void main (String [] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;
        // устанавливаем процентные ставки 10...15%
        double [] Rate = new double [NRATES];
        for (int j=0; j< Rate.length; j++)
            Rate [j] = (STARTRATE+j)/100.0;
        double [][] balances = new double[NYEARS][NRATES];
        //установить исходные остатки на счету раынми 10000
        for (int j=0; j < balances[0].length;j++)
            balances[0][j]=10000;
        //рассчитать проценты на следующие годы
        for (int i = 1; i< balances.length;i++){
            for (int j=0; j< balances[0].length;j++){
               // получить остатки  на счету за прошлый год
                double oldBalance = balances[i-1][j];
                //рассчитать проценты
                double interest = oldBalance*Rate[j];
                //рассчитать остатки на счету в текущем году
                balances[i][j] = oldBalance + interest;
            }
        }
        //вывести один ряд процентных ставок
        for (int j=0; j< Rate.length;j++)
        System.out.printf("%9.0f%%",100*Rate[j]);
        System.out.println();
        //вывести таблицу остатков на счету
        for (double[]row:balances){
            //вывести строку таблицы
            for (double b:row)
                System.out.printf("%10.2f",b);

            System.out.println();
        }
    }
}
