package com.rusefi.pinout;

import java.io.*;
import java.util.List;

public interface BoardInputs {
    List<? extends File> getBoardYamlKeys();

    Reader getReader(File yamlKey) throws FileNotFoundException;

    String getName();

    List<String> getInputFiles();

    Writer getWriter() throws IOException;
}
