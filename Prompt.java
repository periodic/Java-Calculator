import java.io.*;

class Prompt {
    
    BufferedReader in;
    PrintStream out;
    public Prompt(InputStream in, PrintStream out) {
        this.in = new BufferedReader(new InputStreamReader(in));
        this.out = out;
    }

    public String getLine() throws IOException {
        String st = in.readLine();
        return st;
    }

    public String promptLine() throws IOException {
        drawPrompt();
        return getLine();
    }

    private void drawPrompt() {
        out.print(">> ");
    }

    public static void main (String [] args)
    {
        Prompt prompt = new Prompt(System.in, System.out);

        try {

            String st = prompt.promptLine();

            System.out.println(st);
            
        }
        catch (IOException e) 
        {
            System.out.println("IO error.");
            System.out.println(e);
        }
    }
}

