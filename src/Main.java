import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.print("day of birth :");
        day = input.nextInt();

        System.out.print("month of birth :");
        month = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("oglak burcu");
                } else {
                    System.out.println("kova burcu");

                }
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day < 20) {
                    System.out.println("kova burcu");
                } else {
                    System.out.println("Balık burcu");
                }
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Balık burcu");
                } else {
                    System.out.println("koç burcu");
                }
            }

        }else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    System.out.println("koç burcu");
                } else {
                    System.out.println("boga burcu");
                }


            }
        }else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("boga burcu");
                } else {
                    System.out.println("ikizler burcu");
                }
            }
        }else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("ikizler burcu");
                } else {
                    System.out.println("yengec burcu");
                }


            }
        }else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("yengec burcu");
                } else {
                    System.out.println("aslan  burcu");
                }
            }
        }else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("aslan  burcu");
                } else {
                    System.out.println("basak burcu");
                }

            }
        }else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("basak burcu");
                } else {
                    System.out.println("terazi burcu");
                }
            }
        }else if (month == 10) {
             if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("terazi burcu");
                } else {
                    System.out.println("akrep burcu");
                }
            }
        }else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    System.out.println("akrep burcu");
                } else {
                    System.out.println("yay burcu");
                }
            }
        }else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("yay burcu");
                } else {
                    System.out.println("oglak burcu");
                }
            }
        }else {
            System.out.println("hatalı giriş yaptınız");

            



            

        }



    }


            }









