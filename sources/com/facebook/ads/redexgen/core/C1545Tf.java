package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1545Tf {
    public static byte[] A00;
    public static String[] A01 = {"Y", "xyQF3sxjnp2qUSvJDNu5P0iyyc584Vpd", "idh0g523ELVLwEFfu1u5qrhcL3DPrNZC", "UJ0fDp2QsgF1WBSdDofKnf2EwbpjWzp9", "LsjKEz1u6vy", "QA8fX7ramcT9ifSsWPTVo7ChqvJDDBqT", "HHR99srKdCFKOrgMnrhL9AMY8z42dkOr", "PWBGS5sCKwM35N3BbQj09sXNColJxvDn"};
    public static final Object A02;
    public static final String A03;
    public static final Map<String, Integer> A04;
    public static final Set<String> A05;
    public static final AtomicInteger A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1547Th A01(String str, T8 t8, Map<String, String> map) {
        C1547Th c1547Th = null;
        try {
            c1547Th = new C1547Th(t8.A09().A01(), t8.A09().A02(), new TR(str, map, true).A02());
            A0C(c1547Th, t8);
            return c1547Th;
        } catch (Exception unused) {
            return c1547Th;
        }
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JSONArray A04(T8 t8, int i) {
        InterfaceC1542Tc interfaceC1542TcA08;
        JSONArray jSONArray = new JSONArray();
        synchronized (A02) {
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        if (new File(t8.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8)).exists()) {
                            fileInputStreamOpenFileInput = t8.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8));
                            inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                            bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null || i == 0) {
                                    break;
                                }
                                JSONObject jSONObject = new JSONObject(line);
                                if (!jSONObject.has(A02(260, 7, 82))) {
                                    jSONObject.put(A02(260, 7, 82), String.valueOf(0));
                                }
                                String string = jSONObject.getString(A02(343, 2, 110));
                                if (!A05.contains(string)) {
                                    int i2 = jSONObject.getInt(A02(260, 7, 82));
                                    if (A04.containsKey(string)) {
                                        jSONObject.put(A02(260, 7, 82), String.valueOf(A04.get(string)));
                                    } else {
                                        A0E(string, i2);
                                    }
                                    jSONArray.put(jSONObject);
                                    if (i > 0) {
                                        i--;
                                    }
                                }
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                e = e;
                                interfaceC1542TcA08 = t8.A08();
                                interfaceC1542TcA08.A4I(e);
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (IOException | JSONException e2) {
                        t8.A08().A4I(e2);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e = e3;
                                interfaceC1542TcA08 = t8.A08();
                                interfaceC1542TcA08.A4I(e);
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        t8.A08().A4I(e4);
                        throw th2;
                    }
                }
                if (0 != 0) {
                    inputStreamReader.close();
                }
                if (0 != 0) {
                    fileInputStreamOpenFileInput.close();
                }
                throw th2;
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A00 = new byte[]{-73, -24, -36, 0, 46, 43, 44, -1, 43, 49, 42, 48, 33, 46, -10, -36, -73, -43, -30, -101, -24, -108, -40, -39, -32, -39, -24, -39, -108, -40, -39, -42, -23, -37, -108, -39, -22, -39, -30, -24, -25, -108, -38, -35, -32, -39, -94, 30, 60, 73, 2, 79, -5, Utf8.REPLACEMENT_BYTE, RemoteControlWriter.BLOCK_CMDDUMP, 71, RemoteControlWriter.BLOCK_CMDDUMP, 79, RemoteControlWriter.BLOCK_CMDDUMP, -5, 65, 68, 71, RemoteControlWriter.BLOCK_CMDDUMP, -4, 25, 26, 23, 42, 28, 52, 37, 39, 26, 27, -43, 6, -11, -2, 4, -45, -1, 5, -2, 4, 3, -1, -2, 50, 33, 38, 34, 43, RemoteControlWriter.BLOCK_CMDOK, 34, 11, 34, 49, 52, 44, 47, 40, -36, 1, -2, -13, -15, -84, -16, -15, -18, 1, -13, -84, -15, 2, -15, -6, 0, -1, -84, -14, -11, -8, -15, -70, -106, -46, -11, -8, -15, -84, -1, -11, 6, -15, -58, -84, RemoteControlWriter.BLOCK_CMDOK, 56, 54, 61, 61, 50, 49, -19, 50, 67, 50, 59, 65, RemoteControlWriter.BLOCK_CMDDUMP, -5, 1, 25, 23, 30, 30, 23, 28, 21, -50, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 29, RemoteControlWriter.BLOCK_CMDOK, RemoteControlWriter.BLOCK_CMDOK, 35, 30, 34, 19, 18, -50, 18, 19, ExecutionDataWriter.BLOCK_SESSIONINFO, 35, 21, -50, 19, 36, 19, 28, 34, -50, 26, 23, 28, 19, -36, 44, 74, 81, 65, 70, Utf8.REPLACEMENT_BYTE, -8, 76, 71, -8, 77, 72, 60, 57, 76, 61, -8, 77, 70, 74, 61, 59, 71, 74, 60, 61, 60, -8, 60, 61, 58, 77, Utf8.REPLACEMENT_BYTE, 36, 71, Utf8.REPLACEMENT_BYTE, 29, 78, 61, 70, 76, 6, -8, 57, 60, 60, 65, 70, Utf8.REPLACEMENT_BYTE, -8, 76, 71, -8, 39, 70, Utf8.REPLACEMENT_BYTE, 71, 65, 70, Utf8.REPLACEMENT_BYTE, 29, 78, 61, 70, 76, 6, 36, 57, 42, 50, 53, 29, 48, 48, 33, 41, 44, 48, -13, -16, 3, -16, -45, -44, -50, -37, -34, -42, -42, -40, -35, -42, -23, -22, -25, -6, -20, -15, -12, -20, -8, 34, 37, 42, 37, 47, 36, 33, RemoteControlWriter.BLOCK_CMDOK, -36, 33, 50, 33, 42, 48, -36, 47, 36, 43, 49, 40, RemoteControlWriter.BLOCK_CMDOK, -36, 42, 43, 48, -36, 30, 33, -36, 49, 44, RemoteControlWriter.BLOCK_CMDOK, 29, 48, 33, RemoteControlWriter.BLOCK_CMDOK, -36, 48, 43, -36, 11, 42, 35, 43, 37, 42, 35, 1, 50, 33, 42, 48, -22, 65, 60, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, -13, -27, -13, -13, -23, -17, -18, -33, -12, -23, -19, -27, 49, 41, 39, 46, 46, 35, 34, 3, 52, 35, 44, 50, 49, -34, -5, -34, -34, -32, -51, -33, -28, -37, -48, 19, 21, 2, 20, 25, ExecutionDataWriter.BLOCK_SESSIONINFO, 5, -1, 3, 15, 4, 5, 70, 59, Utf8.REPLACEMENT_BYTE, 55, 74, 79, 70, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(T8 t8) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A02) {
            int i = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    try {
                        if (new File(t8.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8)).exists()) {
                            fileInputStreamOpenFileInput = t8.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8));
                            inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                            bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                JSONObject jSONObject = new JSONObject(line);
                                String string = jSONObject.getString(A02(343, 2, 110));
                                if (!A05.contains(string)) {
                                    if (A04.containsKey(string)) {
                                        Integer num = A04.get(string);
                                        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                        int iA02 = AbstractC1583Ur.A02(t8);
                                        if (iA02 <= -1 || numValueOf.intValue() <= iA02 - 1) {
                                            jSONObject.put(A02(260, 7, 82), String.valueOf(numValueOf));
                                            jSONArray.put(jSONObject);
                                        } else {
                                            A0D(string);
                                            i++;
                                        }
                                    } else {
                                        jSONArray.put(jSONObject);
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                sb.append(jSONArray.getJSONObject(i2).toString()).append('\n');
                            }
                            fileOutputStreamOpenFileOutput = t8.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8), 0);
                            fileOutputStreamOpenFileOutput.write(sb.toString().getBytes());
                        }
                        A09(t8, A00(t8));
                        if (i > 0) {
                            t8.A08().ABC(A02(271, 10, 5), AbstractC1543Td.A2Y, new C1544Te(A02(138, 15, 99), A02(367, 16, 84) + i));
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                t8.A08().A4I(e);
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                        A05.clear();
                        A04.clear();
                        return true;
                    } catch (IOException | JSONException e2) {
                        t8.A08().A4I(e2);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                t8.A08().A4I(e3);
                                A05.clear();
                                A04.clear();
                                return false;
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                        A05.clear();
                        A04.clear();
                        return false;
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            t8.A08().A4I(e4);
                            A05.clear();
                            A04.clear();
                            throw th;
                        }
                    }
                    if (0 != 0) {
                        inputStreamReader.close();
                    }
                    if (0 != 0) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (0 != 0) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A05.clear();
                    A04.clear();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0229 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x022e A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0233 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0238 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x023d A[Catch: IOException -> 0x0241, all -> 0x0254, TRY_LEAVE, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x005d A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0H(T8 t8) {
        int iIntValue;
        synchronized (A02) {
            int i = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            FileInputStream fileInputStreamOpenFileInput2 = null;
            FileOutputStream fileOutputStreamOpenFileOutput2 = null;
            try {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8);
                    File file = new File(t8.getFilesDir(), processSpecificName);
                    String str = processSpecificName + A02(255, 5, 91);
                    A0A(t8, str);
                    if (file.exists()) {
                        fileOutputStreamOpenFileOutput2 = t8.openFileOutput(str, 32768);
                        fileInputStreamOpenFileInput = t8.openFileInput(processSpecificName);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject(line);
                                            String string = jSONObject.getString(A02(343, 2, 110));
                                            if (!A05.contains(string)) {
                                                if (A04.containsKey(string)) {
                                                    try {
                                                        Integer num = A04.get(string);
                                                        if (num != null) {
                                                            try {
                                                                iIntValue = num.intValue();
                                                            } catch (IOException e) {
                                                                e = e;
                                                            } catch (JSONException e2) {
                                                                e = e2;
                                                                if (t8.A05().AAO()) {
                                                                    Log.e(A03, A02(153, 36, 68), e);
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                if (bufferedReader != null) {
                                                                    try {
                                                                        bufferedReader.close();
                                                                    } catch (IOException e3) {
                                                                        t8.A08().A4I(e3);
                                                                        A05.clear();
                                                                        A04.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                                if (inputStreamReader != null) {
                                                                    inputStreamReader.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput != null) {
                                                                    fileInputStreamOpenFileInput.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput != null) {
                                                                    fileOutputStreamOpenFileOutput.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput2 != null) {
                                                                    fileInputStreamOpenFileInput2.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                                    fileOutputStreamOpenFileOutput2.close();
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                throw th;
                                                            }
                                                        } else {
                                                            iIntValue = 0;
                                                        }
                                                        Integer numValueOf = Integer.valueOf(iIntValue);
                                                        int iA02 = AbstractC1583Ur.A02(t8);
                                                        if (iA02 > -1) {
                                                            try {
                                                                if (numValueOf.intValue() > iA02 - 1) {
                                                                    try {
                                                                        try {
                                                                            A0D(string);
                                                                            i++;
                                                                        } catch (IOException e4) {
                                                                            e = e4;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            if (bufferedReader != null) {
                                                                                bufferedReader.close();
                                                                            }
                                                                            if (inputStreamReader != null) {
                                                                                inputStreamReader.close();
                                                                            }
                                                                            if (fileInputStreamOpenFileInput != null) {
                                                                                fileInputStreamOpenFileInput.close();
                                                                            }
                                                                            if (fileOutputStreamOpenFileOutput != null) {
                                                                                fileOutputStreamOpenFileOutput.close();
                                                                            }
                                                                            if (fileInputStreamOpenFileInput2 != null) {
                                                                                fileInputStreamOpenFileInput2.close();
                                                                            }
                                                                            if (fileOutputStreamOpenFileOutput2 != null) {
                                                                                fileOutputStreamOpenFileOutput2.close();
                                                                            }
                                                                            A05.clear();
                                                                            A04.clear();
                                                                            throw th;
                                                                        }
                                                                    } catch (JSONException e5) {
                                                                        e = e5;
                                                                        if (t8.A05().AAO()) {
                                                                            Log.e(A03, A02(153, 36, 68), e);
                                                                        }
                                                                    }
                                                                }
                                                            } catch (IOException e6) {
                                                                e = e6;
                                                            } catch (JSONException e7) {
                                                                e = e7;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                if (bufferedReader != null) {
                                                                    bufferedReader.close();
                                                                }
                                                                if (inputStreamReader != null) {
                                                                    inputStreamReader.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput != null) {
                                                                    fileInputStreamOpenFileInput.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput != null) {
                                                                    fileOutputStreamOpenFileOutput.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput2 != null) {
                                                                    fileInputStreamOpenFileInput2.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                                    fileOutputStreamOpenFileOutput2.close();
                                                                }
                                                                A05.clear();
                                                                A04.clear();
                                                                throw th;
                                                            }
                                                        }
                                                        jSONObject.put(A02(260, 7, 82), String.valueOf(numValueOf));
                                                        fileOutputStreamOpenFileOutput2.write((jSONObject.toString() + '\n').getBytes());
                                                    } catch (IOException e8) {
                                                        e = e8;
                                                    } catch (JSONException e9) {
                                                        e = e9;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } else {
                                                    fileOutputStreamOpenFileOutput2.write((jSONObject.toString() + '\n').getBytes());
                                                }
                                            }
                                        } catch (JSONException e10) {
                                            e = e10;
                                        }
                                    } catch (IOException e11) {
                                        e = e11;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    t8.A08().A4I(e);
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e12) {
                                            t8.A08().A4I(e12);
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        inputStreamReader.close();
                                    }
                                    if (fileInputStreamOpenFileInput != null) {
                                        fileInputStreamOpenFileInput.close();
                                    }
                                    if (fileOutputStreamOpenFileOutput != null) {
                                        fileOutputStreamOpenFileOutput.close();
                                    }
                                    if (fileInputStreamOpenFileInput2 != null) {
                                        fileInputStreamOpenFileInput2.close();
                                    }
                                    if (fileOutputStreamOpenFileOutput2 != null) {
                                        fileOutputStreamOpenFileOutput2.close();
                                    }
                                    A05.clear();
                                    A04.clear();
                                    return false;
                                }
                                fileInputStreamOpenFileInput2 = t8.openFileInput(str);
                                fileOutputStreamOpenFileOutput = t8.openFileOutput(processSpecificName, 0);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i2 = fileInputStreamOpenFileInput2.read(bArr);
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    fileOutputStreamOpenFileOutput.write(bArr, 0, i2);
                                }
                                fileInputStreamOpenFileInput2.close();
                                fileOutputStreamOpenFileOutput2.close();
                                A0A(t8, str);
                            } catch (IOException e13) {
                                e = e13;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (IOException e14) {
                            e = e14;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    A09(t8, A00(t8));
                    if (i > 0) {
                        t8.A08().ABC(A02(271, 10, 5), AbstractC1543Td.A2Y, new C1544Te(A02(138, 15, 99), A02(367, 16, 84) + i));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e15) {
                            t8.A08().A4I(e15);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    if (fileInputStreamOpenFileInput2 != null) {
                        fileInputStreamOpenFileInput2.close();
                    }
                    if (fileOutputStreamOpenFileOutput2 != null) {
                        fileOutputStreamOpenFileOutput2.close();
                    }
                    A05.clear();
                    A04.clear();
                    return true;
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException e16) {
                e = e16;
            }
        }
    }

    static {
        A06();
        A03 = C1545Tf.class.getName();
        A02 = new Object();
        A05 = Collections.synchronizedSet(new HashSet());
        A04 = Collections.synchronizedMap(new HashMap());
        A06 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) - A05.size();
    }

    public static JSONArray A03(T8 t8) {
        return A04(t8, -1);
    }

    public static JSONObject A05(C1547Th c1547Th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 110), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 108), c1547Th.A03());
        jSONObject.put(A02(TTAdConstant.AD_ID_IS_NULL_CODE, 4, 104), Y1.A03(c1547Th.A01()));
        jSONObject.put(A02(355, 12, 22), Y1.A03(c1547Th.A00()));
        jSONObject.put(A02(345, 10, 28), c1547Th.A02());
        jSONObject.put(A02(267, 4, 37), c1547Th.A04() != null ? new JSONObject(c1547Th.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 82), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A02) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A05.clear();
            A04.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) + 1);
    }

    public static void A09(Context context, int i) {
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (i >= 0) {
            i2 = i;
        }
        if (A01[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        A01[0] = "i";
        editorEdit.putInt(A02(75, 10, 38), i2).apply();
    }

    public static void A0A(T8 t8, String str) {
        File file = new File(t8.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            t8.A08().A4I(new RuntimeException(A02(47, 18, 113)));
        }
    }

    public static void A0B(C2127ge c2127ge, String str) {
        Integer num = A04.get(str);
        if (num == null) {
            if (c2127ge.A05().AAO()) {
                Log.e(A03, A02(189, 66, 110));
            }
            num = 0;
        } else {
            A04.remove(str);
        }
        Map<String, Integer> map = A04;
        Integer attempt = Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(C1547Th c1547Th, T8 t8) {
        if (c1547Th != null && t8 != null) {
            synchronized (A02) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 27), t8);
                    File file = new File(t8.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = AbstractC1583Ur.A07(t8);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean zDelete = file.delete();
                            A09(t8, 0);
                            A05.clear();
                            A04.clear();
                            if (zDelete) {
                                Map<String, String> mapA5a = t8.A04().A5a();
                                mapA5a.put(A02(383, 7, 1), A02(271, 10, 5));
                                mapA5a.put(A02(390, 12, 54), String.valueOf(2401));
                                A01(A02(102, 36, 34) + length + A02(1, 15, 82) + A06.getAndIncrement(), t8, mapA5a);
                                return;
                            }
                            String processSpecificName2 = A02(85, 17, 83);
                            Log.e(processSpecificName2, A02(16, 31, 10));
                        }
                    }
                    JSONObject jSONObjectA05 = A05(c1547Th);
                    FileOutputStream outputStream = t8.openFileOutput(processSpecificName, 32768);
                    outputStream.write((jSONObjectA05.toString() + A02(0, 1, 67)).getBytes());
                    outputStream.close();
                    A08(t8);
                } catch (Exception e) {
                    t8.A08().A4I(e);
                }
            }
        }
    }

    public static void A0D(String str) {
        A04.remove(str);
        A05.add(str);
    }

    public static void A0E(String str, int i) {
        if (!A05.contains(str)) {
            if (A04.containsKey(str)) {
                A04.remove(str);
            }
            A04.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException(A02(290, 53, 82));
    }

    public static boolean A0F(T8 t8) {
        if (AbstractC1583Ur.A0O(t8)) {
            return A0H(t8);
        }
        return A0G(t8);
    }

    public static boolean A0I(String str) {
        return A05.contains(str) || A04.containsKey(str);
    }
}
