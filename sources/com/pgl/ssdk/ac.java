package com.pgl.ssdk;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FileFilter f33399a = new a();

    public static class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    private static String a(String str) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String line = null;
        try {
            fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    line = bufferedReader.readLine();
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (fileReader != null) {
                    }
                    if (line == null) {
                        return "0";
                    }
                    return line.trim();
                }
            } catch (Throwable unused4) {
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (Throwable unused6) {
        }
        if (line == null) {
            return "0";
        }
        return line.trim();
    }

    private static HashMap<String, String> b() {
        FileReader fileReader;
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        } else {
                            String[] strArrSplit = line.split(":", 2);
                            if (strArrSplit.length >= 2) {
                                String strTrim = strArrSplit[0].trim();
                                String strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        return map;
                    }
                }
                bufferedReader2.close();
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (Throwable unused6) {
        }
        return map;
    }

    public static String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> mapB = b();
            jSONObject.put("core", a());
            jSONObject.put("hw", a(mapB, "Hardware"));
            jSONObject.put("max", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", a(mapB, "Features"));
        } catch (Throwable unused) {
        }
        String string = jSONObject.toString();
        return string == null ? JsonUtils.EMPTY_JSON : string.trim();
    }

    private static String a(HashMap<String, String> map, String str) {
        String str2;
        try {
            str2 = map.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    private static int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f33399a).length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
