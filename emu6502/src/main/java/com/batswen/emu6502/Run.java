package com.batswen.emu6502;

import com.batswen.emu6502.cpu.CPU;
import com.batswen.emu6502.cpu.Loader;
import org.apache.commons.codec.binary.Hex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Run {
    public static final Path ROM_FILE = Paths.get("rom.bin");
    public static final Path PROGRAM_FILE = Paths.get("program.rom");
    public static final short ROM_SIZE = (short) 0xffff;

    public static void main(String[] args) throws IOException {
//        String program = "2000-20-00-30-a9-02-a2-0a-9d-00-04-ca-10-fa-a0-03-91-a0-88-d0-fb-00";
        if (!Files.exists(ROM_FILE)) {
            Files.createFile(ROM_FILE);
            if (Files.exists(PROGRAM_FILE)) {
                rom = new Rom(Files.readAllBytes())
            } else {
                rom = Rom.empty().getBytecode();
            }
            if (Files.write(ROM_FILE, ))
        }

        Rom rom = new Rom(Files.readAllBytes(ROM_FILE));
        CPU cpu = new CPU();
        Loader loader = new Loader(cpu);
        loader.load()

        loader.load("fffc-0020"); // Reset vector
        loader.load("00a0-2004"); // Test vector for (--),Y
        loader.write(0x2000, Files.readAllBytes(Paths.get("rom.bin")));
//        loader.load(program);
        loader.load("3000-a934ff01a932ff0160");
        cpu.reset();
        for (int i = 0; i < 100; i++) {
            cpu.execute();
        }        
        java.awt.EventQueue.invokeLater(() -> {
            new Win(cpu).setVisible(true);
        });
    }
}
