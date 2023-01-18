import java.io.*;

public class SortByMerge {
    public static void main(String[] args) {

        try (FileWriter fileWriter1 = new FileWriter(args[2]);
             FileWriter fileWriter2 = new FileWriter(args[3]);
             FileWriter fileWriter3 = new FileWriter(args[4])) {
            fileWriter1.write(3 + "\n");
            fileWriter1.write(4 + "\n");
            fileWriter1.write(9 + "");
            fileWriter2.write(2 + "\n");
            fileWriter2.write(3 + "\n");
            fileWriter2.write(5 + "");
            fileWriter3.write(3 + "\n");
            fileWriter3.write(10 + "\n");
            fileWriter3.write(1 + "");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader reader1 = new BufferedReader(new FileReader(args[2]));
             BufferedReader reader2 = new BufferedReader(new FileReader(args[3]));
             BufferedReader reader3 = new BufferedReader(new FileReader(args[4]));
             FileWriter writer = new FileWriter(args[1])) {

            if (args[0].equals("-i")) {
                System.out.println("files contain integers");
            }
            if (args[0].equals("-s") ){
                System.out.println("files contain strings");
            }
            int in1, in2, in3, in;

            in1 = Integer.parseInt(reader1.readLine());
            in2 = Integer.parseInt(reader2.readLine());
            in3 = Integer.parseInt(reader3.readLine());
            String s;

            while (true) {
                if (in1 <= in2 & in1 <= in3) {
                    writer.write(in1 + "\n");
                    if ((s = reader1.readLine()) != null) {
                        if ((in = Integer.parseInt(s)) >= in1)
                            in1 = in;
                        else {
                            while ((s = reader1.readLine()) != null) {
                                if ((in = Integer.parseInt(s)) >= in1) {
                                    in1 = in;
                                    break;
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (in2 <= in3) {
                                writer.write(in2 + "\n");
                                if ((s = reader2.readLine()) != null) {
                                    if ((in = Integer.parseInt(s)) >= in2)
                                        in2 = in;
                                    else {
                                        while ((s = reader2.readLine()) != null) {
                                            if ((in = Integer.parseInt(s)) >= in2) {
                                                in2 = in;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    writer.write(in3 + "\n");
                                    while ((s = reader3.readLine()) != null) {
                                        if ((in = Integer.parseInt(s)) >= in3)
                                            writer.write(in + "");
                                    }
                                    break;
                                }
                            } else {
                                writer.write(in3 + "\n");
                                if ((s = reader3.readLine()) != null) {
                                    if ((in = Integer.parseInt(s)) >= in3)
                                        in3 = in;
                                    else {
                                        while ((s = reader3.readLine()) != null) {
                                            if ((in = Integer.parseInt(s)) >= in3) {
                                                in3 = in;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    writer.write(in2 + "\n");
                                    while ((s = reader2.readLine()) != null) {
                                        if ((in = Integer.parseInt(s)) >= in2)
                                            writer.write(in + "");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
// второй блок сравнения -------------------------------------------------------------
                if (in2 <= in1 & in2 <= in3) {
                    writer.write(in2 + "\n");
                    if ((s = reader2.readLine()) != null) {
                        if ((in = Integer.parseInt(s)) >= in2)
                            in2 = in;
                        else {
                            while ((s = reader2.readLine()) != null) {
                                if ((in = Integer.parseInt(s)) >= in2) {
                                    in2 = in;
                                    break;
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (in1 <= in3) {
                                writer.write(in1 + "\n");
                                if ((s = reader1.readLine()) != null) {
                                    if ((in = Integer.parseInt(s)) >= in1)
                                        in1 = in;
                                    else {
                                        while ((s = reader1.readLine()) != null) {
                                            if ((in = Integer.parseInt(s)) >= in1) {
                                                in1 = in;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    writer.write(in3 + "\n");
                                    while ((s = reader3.readLine()) != null) {
                                        if ((in = Integer.parseInt(s)) >= in3)
                                            writer.write(in + "");
                                    }
                                    break;
                                }
                            } else {
                                writer.write(in3 + "\n");
                                if ((s = reader3.readLine()) != null) {
                                    if ((in = Integer.parseInt(s)) >= in3)
                                        in3 = in;
                                    else {
                                        while ((s = reader3.readLine()) != null) {
                                            if ((in = Integer.parseInt(s)) >= in3) {
                                                in3 = in;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    writer.write(in1 + "\n");
                                    while ((s = reader1.readLine()) != null) {
                                        if ((in = Integer.parseInt(s)) >= in1)
                                            writer.write(in + "");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
//   третий блок ----------------------------------------------------------
                if (in3 <= in1 & in3 <= in2) {
                    writer.write(in3 + "\n");
                    if ((s = reader3.readLine()) != null) {
                        if ((in = Integer.parseInt(s)) >= in3)
                            in3 = in;
                        else {
                            while ((s = reader3.readLine()) != null) {
                                if ((in = Integer.parseInt(s)) >= in3) {
                                    in3 = in;
                                    break;
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (in1 <= in2) {
                                writer.write(in1 + "\n");
                                if ((s = reader1.readLine()) != null) {
                                    if ((in = Integer.parseInt(s)) >= in1)
                                        in1 = in;
                                    else {
                                        while ((s = reader1.readLine()) != null) {
                                            if ((in = Integer.parseInt(s)) >= in1) {
                                                in1 = in;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    writer.write(in2 + "\n");
                                    while ((s = reader2.readLine()) != null) {
                                        if ((in = Integer.parseInt(s)) >= in2)
                                            writer.write(in + "");
                                    }
                                    break;
                                }
                            } else {
                                writer.write(in2 + "\n");
                                if ((s = reader2.readLine()) != null) {
                                    if ((in = Integer.parseInt(s)) >= in2)
                                        in2 = in;
                                    else {
                                        while ((s = reader2.readLine()) != null) {
                                            if ((in = Integer.parseInt(s)) >= in2) {
                                                in2 = in;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    writer.write(in1 + "\n");
                                    while ((s = reader1.readLine()) != null) {
                                        if ((in = Integer.parseInt(s)) >= in1)
                                            writer.write(in + "");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
