package com.techie.demo;

public class TextBlocksDemo {

    public static void main(String[] args) {
        String html = "<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>";

        String java13 = """
                    <html>
                        <body>
                            <p>Hello, World</p>
                        </body>
                    </html>""";

        String java14 = """
                    <html>
                        <body>\
                            <p>Hello, '\s' World</p>\
                        </body>
                    </html>""";

        System.out.println("----Before Java 13----");
        System.out.println(html);
        System.out.println("----From Java 13----");
        System.out.println(java13);
        System.out.println("----From Java 14----");
        System.out.println(java14);
    }
}
