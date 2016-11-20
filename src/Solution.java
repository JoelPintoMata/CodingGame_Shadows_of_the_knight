import java.util.Scanner;


/**
 * CodingGame.com "Shadows of the knight episode 1" solution
 */
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        double aux;
        int maxW = W-1;
        int minW = 0;
        int maxH = H-1;
        int minH = 0;
        
//        game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if(bombDir.equals("U")) {
                maxH = Y0;
                aux = Math.abs(maxH - minH);
            	Y0 = (int) (Y0 - Math.round(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("UR")) {
                maxH = Y0;
                aux = Math.abs(maxH - minH);
            	Y0 = (int) (Y0 - Math.round(aux / 2));
                minW = X0;
                aux = Math.abs(maxW - minW);
            	X0 = (int) (X0 + Math.ceil(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("R")) {
                aux = Math.abs(maxH - minH);
            	X0 = (int) (X0 + (aux / 2));
                maxH = X0;
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("DR")) {
                minH = Y0;
                aux = Math.abs(maxH - minH);
            	Y0 = (int) (Y0 + Math.round(aux / 2));
                minW = X0;
                aux = Math.abs(maxW - minW);
            	X0 = (int) (X0 + Math.round(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("DL")) {
                minH = Y0;
                aux = Math.abs(maxH - minH);
            	Y0 = (int) (Y0 + Math.round(aux / 2));
                maxW = X0;
                aux = Math.abs(maxW - minW);
            	X0 = (int) (X0 - Math.round(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("D")) {
                minH = Y0;
                aux = Math.abs(maxH - minH);
            	Y0 = (int) (Y0 + Math.round(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("L")) {
                maxW = Y0;
                aux = Math.abs(maxW - minW);
            	X0 = (int) (X0 - Math.round(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
            if(bombDir.equals("UL")) {
                maxH = Y0;
                aux = Math.abs(maxH - minH);
            	Y0 = (int) (Y0 - Math.round(aux / 2));
                maxW = X0;
                aux = Math.abs(maxW - minW);
            	X0 = (int) (X0 - Math.round(aux / 2));
                System.out.println(X0 + " " + Y0);
                continue;
            }
        }
    }
}