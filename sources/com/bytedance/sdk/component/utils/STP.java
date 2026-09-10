package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class STP {
    private static volatile STP lk;
    private volatile boolean LD = false;
    private Map<String, String> Lxb;
    private Context ZU;

    private STP(Context context) {
        if (context != null && this.ZU == null) {
            this.ZU = context.getApplicationContext();
            Lxb();
        }
        this.ZU = context;
    }

    private static String JXs(String str) {
        int iIndexOf;
        return (str == null || str.isEmpty() || (iIndexOf = str.indexOf(46)) < 0 || iIndexOf >= str.length() + (-1)) ? "" : str.substring(iIndexOf + 1);
    }

    private static String LD(String str) {
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0) {
            return null;
        }
        String strTrim = str.substring(0, iIndexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = strTrim.toLowerCase(locale);
        if (!lk(lowerCase)) {
            return null;
        }
        int i = iIndexOf + 1;
        String lowerCase2 = (iIndexOf2 < 0 ? str.substring(i) : str.substring(i, iIndexOf2)).trim().toLowerCase(locale);
        if (!lk(lowerCase2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(lowerCase2.length() + lowerCase.length() + 1);
        sb.append(lowerCase);
        sb.append('/');
        sb.append(lowerCase2);
        return sb.toString();
    }

    private String ZU(String str) {
        String str2;
        String strJXs = JXs(str);
        if (strJXs.isEmpty()) {
            return null;
        }
        Lxb();
        Map<String, String> map = this.Lxb;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.Lxb.get(strJXs);
            if (str2 == null) {
                strJXs = JXs(strJXs);
            }
            if (str2 != null) {
                break;
            }
        } while (!strJXs.isEmpty());
        return str2;
    }

    private void lc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        if (strTrim.charAt(0) == '#') {
            return;
        }
        String strReplaceAll = strTrim.replaceAll("\\s*#.*", "");
        if (strReplaceAll.indexOf(61) <= 0) {
            String[] strArrSplit = strReplaceAll.split("\\s+");
            for (int i = 1; i < strArrSplit.length; i++) {
                Lxb(strArrSplit[i], strArrSplit[0]);
            }
            return;
        }
        Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(strReplaceAll);
        if (matcher.find()) {
            String strSubstring = matcher.group().substring(5);
            if (strSubstring.charAt(0) == '\"') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
            }
            Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(strReplaceAll);
            if (matcher2.find()) {
                String strSubstring2 = matcher2.group().substring(5);
                if (strSubstring2.charAt(0) == '\"') {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                }
                for (String str2 : strSubstring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                    Lxb(str2, strSubstring);
                }
            }
        }
    }

    private static boolean lk(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!Lxb(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String Lxb(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith(ProxyConfig.MATCH_HTTP) && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return Lxb(context).Lxb(str);
    }

    public static STP Lxb(Context context) {
        if (lk == null) {
            synchronized (STP.class) {
                try {
                    if (lk == null) {
                        lk = new STP(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lk;
    }

    public final String Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strZU = ZU(str);
        if (TextUtils.isEmpty(strZU)) {
            return null;
        }
        return LD(strZU);
    }

    private static boolean Lxb(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    private void Lxb() {
        if (this.ZU == null || this.LD) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.LD) {
                    List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.STP.1
                        @Override // java.security.PrivilegedAction
                        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
                        public List<String> run() {
                            BufferedReader bufferedReader;
                            InputStream inputStream = null;
                            try {
                                ArrayList arrayList = new ArrayList();
                                InputStream inputStreamOpen = STP.this.ZU.getAssets().open("tt_mime_type.pro");
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            if (!TextUtils.isEmpty(line)) {
                                                arrayList.add(line);
                                            }
                                        } catch (Throwable unused) {
                                            inputStream = inputStreamOpen;
                                            try {
                                                return Collections.emptyList();
                                            } finally {
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable unused3) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (inputStreamOpen != null) {
                                        try {
                                            inputStreamOpen.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused5) {
                                    }
                                    return arrayList;
                                } catch (Throwable unused6) {
                                    bufferedReader = null;
                                }
                            } catch (Throwable unused7) {
                                bufferedReader = null;
                            }
                        }
                    });
                    this.Lxb = new HashMap(list.size());
                    String strSubstring = "";
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = strSubstring + ((String) it.next());
                        if (str.endsWith("\\")) {
                            strSubstring = str.substring(0, str.length() - 1);
                        } else {
                            lc(str);
                            strSubstring = "";
                        }
                    }
                    if (!strSubstring.isEmpty()) {
                        lc(strSubstring);
                    }
                    this.LD = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void Lxb(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.Lxb.containsKey(str)) {
            return;
        }
        this.Lxb.put(str, str2);
    }
}
