package org.jacoco.core.runtime;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class AgentOptions {
    public static final String DEFAULT_DESTFILE = "jacoco.exec";
    public static final int DEFAULT_PORT = 6300;
    public static final String SESSIONID = "sessionid";
    private final Map<String, String> options;
    private static final Pattern OPTION_SPLIT = Pattern.compile(",(?=[a-zA-Z0-9_\\-]+=)");
    public static final String DEFAULT_ADDRESS = null;
    public static final String DESTFILE = "destfile";
    public static final String APPEND = "append";
    public static final String INCLUDES = "includes";
    public static final String EXCLUDES = "excludes";
    public static final String EXCLCLASSLOADER = "exclclassloader";
    public static final String INCLBOOTSTRAPCLASSES = "inclbootstrapclasses";
    public static final String INCLNOLOCATIONCLASSES = "inclnolocationclasses";
    public static final String DUMPONEXIT = "dumponexit";
    public static final String OUTPUT = "output";
    public static final String ADDRESS = "address";
    public static final String PORT = "port";
    public static final String CLASSDUMPDIR = "classdumpdir";
    public static final String JMX = "jmx";
    private static final Collection<String> VALID_OPTIONS = Arrays.asList(DESTFILE, APPEND, INCLUDES, EXCLUDES, EXCLCLASSLOADER, INCLBOOTSTRAPCLASSES, INCLNOLOCATIONCLASSES, "sessionid", DUMPONEXIT, OUTPUT, ADDRESS, PORT, CLASSDUMPDIR, JMX);

    public enum OutputMode {
        file,
        tcpserver,
        tcpclient,
        none
    }

    public AgentOptions() {
        this.options = new HashMap();
    }

    private String getOption(String str, String str2) {
        String str3 = this.options.get(str);
        return str3 == null ? str2 : str3;
    }

    private void setOption(String str, int i) {
        setOption(str, Integer.toString(i));
    }

    private void validateAll() {
        validatePort(getPort());
        getOutput();
    }

    private void validatePort(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("port must be positive");
        }
    }

    public String getAddress() {
        return getOption(ADDRESS, DEFAULT_ADDRESS);
    }

    public boolean getAppend() {
        return getOption(APPEND, true);
    }

    public String getClassDumpDir() {
        return getOption(CLASSDUMPDIR, (String) null);
    }

    public String getDestfile() {
        return getOption(DESTFILE, DEFAULT_DESTFILE);
    }

    public boolean getDumpOnExit() {
        return getOption(DUMPONEXIT, true);
    }

    public String getExclClassloader() {
        return getOption(EXCLCLASSLOADER, "sun.reflect.DelegatingClassLoader");
    }

    public String getExcludes() {
        return getOption(EXCLUDES, "");
    }

    public boolean getInclBootstrapClasses() {
        return getOption(INCLBOOTSTRAPCLASSES, false);
    }

    public boolean getInclNoLocationClasses() {
        return getOption(INCLNOLOCATIONCLASSES, false);
    }

    public String getIncludes() {
        return getOption(INCLUDES, "*");
    }

    public boolean getJmx() {
        return getOption(JMX, false);
    }

    public OutputMode getOutput() {
        String str = this.options.get(OUTPUT);
        return str == null ? OutputMode.file : OutputMode.valueOf(str);
    }

    public int getPort() {
        return getOption(PORT, DEFAULT_PORT);
    }

    public String getQuotedVMArgument(File file) {
        return CommandLineSupport.quote(getVMArgument(file));
    }

    public String getSessionId() {
        return getOption("sessionid", (String) null);
    }

    public String getVMArgument(File file) {
        return String.format("-javaagent:%s=%s", file, this);
    }

    public String prependVMArguments(String str, File file) {
        List<String> listSplit = CommandLineSupport.split(str);
        String str2 = String.format("-javaagent:%s", file);
        Iterator<String> it = listSplit.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(str2)) {
                it.remove();
            }
        }
        listSplit.add(0, getVMArgument(file));
        return CommandLineSupport.quote(listSplit);
    }

    public void setAddress(String str) {
        setOption(ADDRESS, str);
    }

    public void setAppend(boolean z) {
        setOption(APPEND, z);
    }

    public void setClassDumpDir(String str) {
        setOption(CLASSDUMPDIR, str);
    }

    public void setDestfile(String str) {
        setOption(DESTFILE, str);
    }

    public void setDumpOnExit(boolean z) {
        setOption(DUMPONEXIT, z);
    }

    public void setExclClassloader(String str) {
        setOption(EXCLCLASSLOADER, str);
    }

    public void setExcludes(String str) {
        setOption(EXCLUDES, str);
    }

    public void setInclBootstrapClasses(boolean z) {
        setOption(INCLBOOTSTRAPCLASSES, z);
    }

    public void setInclNoLocationClasses(boolean z) {
        setOption(INCLNOLOCATIONCLASSES, z);
    }

    public void setIncludes(String str) {
        setOption(INCLUDES, str);
    }

    public void setJmx(boolean z) {
        setOption(JMX, z);
    }

    public void setOutput(String str) {
        setOutput(OutputMode.valueOf(str));
    }

    public void setPort(int i) {
        validatePort(i);
        setOption(PORT, i);
    }

    public void setSessionId(String str) {
        setOption("sessionid", str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : VALID_OPTIONS) {
            String str2 = this.options.get(str);
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
                sb.append('=');
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    private boolean getOption(String str, boolean z) {
        String str2 = this.options.get(str);
        return str2 == null ? z : Boolean.parseBoolean(str2);
    }

    private void setOption(String str, boolean z) {
        setOption(str, Boolean.toString(z));
    }

    public void setOutput(OutputMode outputMode) {
        setOption(OUTPUT, outputMode.name());
    }

    public AgentOptions(String str) {
        this();
        if (str == null || str.length() <= 0) {
            return;
        }
        for (String str2 : OPTION_SPLIT.split(str)) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf != -1) {
                String strSubstring = str2.substring(0, iIndexOf);
                if (VALID_OPTIONS.contains(strSubstring)) {
                    setOption(strSubstring, str2.substring(iIndexOf + 1));
                } else {
                    throw new IllegalArgumentException(String.format("Unknown agent option \"%s\".", strSubstring));
                }
            } else {
                throw new IllegalArgumentException(String.format("Invalid agent option syntax \"%s\".", str));
            }
        }
        validateAll();
    }

    private void setOption(String str, String str2) {
        this.options.put(str, str2);
    }

    private int getOption(String str, int i) {
        String str2 = this.options.get(str);
        return str2 == null ? i : Integer.parseInt(str2);
    }

    public AgentOptions(Properties properties) {
        this();
        for (String str : VALID_OPTIONS) {
            String property = properties.getProperty(str);
            if (property != null) {
                setOption(str, property);
            }
        }
    }
}
