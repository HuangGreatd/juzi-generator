package com.juzipi.basic.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
/**
 * @author juzipi
 * @date 2024/4/20 10:05
 */
@Command(name = "ASCIIArt",version = "ASCIIArt 1.0",mixinStandardHelpOptions = true)
public class ASCIIArt  implements Runnable{
    @Option(names = {"-s","--font-size"},description = "Font size")
    int fontSize = 10;

    @Parameters(paramLabel = "<word>",defaultValue = "Hello,picoli",
            description = "Words to be translated into ASCII art.")
    private String[] words = {"Hello,picoli"};



    @Override
    public void run() {
        System.out.println("fontSize=" + fontSize );
        System.out.println("word=" + String.join(",",words));
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ASCIIArt()).execute();
        System.exit(exitCode);
    }
}
