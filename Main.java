import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Rectangle> noweKwadraty = Arrays.asList(new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)),
                new Rectangle(1+(Math.random()*100),1+(Math.random()*100)));
        System.out.println(noweKwadraty);

        //* Podpunkt A
        List<Rectangle> kwadratyObwodNizPole= noweKwadraty.stream().filter(Rectangle -> Rectangle.getArea() < Rectangle.getPerimiter()).collect(Collectors.toList());
        System.out.println(kwadratyObwodNizPole);

        //* podpunkt B
        List<Rectangle> najwiekszPole= noweKwadraty.stream().sorted(Comparator.comparingDouble(Rectangle::getArea).reversed()).collect(Collectors.toList());
        System.out.println(najwiekszPole);

        //* podpunkt C

        List<Rectangle> najmniejszyObwod =noweKwadraty.stream().sorted(Comparator.comparingDouble(Rectangle::getPerimiter)).collect(Collectors.toList());
        System.out.println(najmniejszyObwod);


        //* podpunkt D

        OptionalDouble sredniaObwodu=noweKwadraty.stream().mapToDouble(Rectangle::getPerimiter).average();
        System.out.println(sredniaObwodu);

        //* podpunkt E

        double sumaPol =noweKwadraty.stream().mapToDouble(Rectangle::getArea).sum();
        System.out.println(sumaPol);

        //* Tworzenie mapy
        Map<Double,Rectangle> mapa= noweKwadraty.stream().collect(Collectors.toMap(Rectangle->Rectangle.getArea(),Rectangle->Rectangle));
        System.out.println(mapa);



    }
}
