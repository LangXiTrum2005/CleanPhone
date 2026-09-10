package com.bytedance.sdk.component.xha.lr;

import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.di;
import com.bytedance.sdk.component.lr.ri.sf;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ik {
    public File lr;
    private volatile boolean qt;
    public File ri;

    public ri(sf sfVar) {
        super(sfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long di(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fi(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean xha(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    @Override // com.bytedance.sdk.component.xha.lr.ik
    public void lr() {
        this.qt = true;
        super.lr();
    }

    public void ri(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.ri = new File(str, str2);
        this.lr = new File(str, str2 + ".temp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void di() {
        try {
            this.ri.delete();
        } catch (Throwable unused) {
        }
        try {
            this.lr.delete();
        } catch (Throwable unused2) {
        }
    }

    public void ri(final com.bytedance.sdk.component.xha.ri.ri riVar) {
        File file = this.ri;
        if (file == null || this.lr == null) {
            if (riVar != null) {
                riVar.ri(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.ri.length() != 0 && riVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.xha.lr lrVar = new com.bytedance.sdk.component.xha.lr(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            lrVar.ri(this.ri);
            riVar.ri(this, lrVar);
            return;
        }
        long length = this.lr.length();
        final long j = length >= 0 ? length : 0L;
        co.ri riVar2 = new co.ri();
        riVar2.ri((Object) ka());
        ri(riVar2);
        lr(Command.HTTP_HEADER_RANGE, "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.mj)) {
            riVar.ri(this, new IOException("Url is Empty"));
            return;
        }
        try {
            riVar2.lr(this.mj);
            if (!TextUtils.isEmpty(this.fi)) {
                riVar2.ri(this.fi);
            }
            int i = this.di;
            if (i > 0) {
                riVar2.ri(i);
            }
            lr(riVar2);
            com.bytedance.sdk.component.lr.ri.lr lrVarRi = this.ik.ri(riVar2.ri().lr());
            if (lrVarRi == null) {
                riVar.ri(this, new IOException("new call error"));
            } else {
                lrVarRi.ri(new com.bytedance.sdk.component.lr.ri.ik() { // from class: com.bytedance.sdk.component.xha.lr.ri.1
                    @Override // com.bytedance.sdk.component.lr.ri.ik
                    public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar2, IOException iOException) {
                        com.bytedance.sdk.component.xha.ri.ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.ri(ri.this, iOException);
                        }
                        ri.this.di();
                    }

                    @Override // com.bytedance.sdk.component.lr.ri.ik
                    public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar2, bgr bgrVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j2;
                        if (riVar == null) {
                            return;
                        }
                        HashMap map = new HashMap();
                        if (bgrVar == null) {
                            return;
                        }
                        ri.this.ri(bgrVar.jbs());
                        di diVarXha = bgrVar.xha();
                        if (diVarXha != null) {
                            for (int i2 = 0; i2 < diVarXha.ri(); i2++) {
                                map.put(diVarXha.ri(i2), diVarXha.lr(i2));
                            }
                        }
                        com.bytedance.sdk.component.xha.lr lrVar3 = new com.bytedance.sdk.component.xha.lr(bgrVar.ka(), bgrVar.ik(), bgrVar.fi(), map, null, bgrVar.lr(), bgrVar.ri());
                        if (bgrVar.ka()) {
                            long jRi = bgrVar.di().ri();
                            long j3 = 0;
                            if (jRi <= 0) {
                                jRi = ri.di(map);
                            }
                            boolean zFi = ri.fi(map);
                            if (zFi) {
                                jRi += j;
                                String str = (String) map.get("Content-Range");
                                if (!TextUtils.isEmpty(str)) {
                                    String str2 = "bytes " + j + "-" + (jRi - 1);
                                    if (TextUtils.indexOf(str, str2) == -1) {
                                        ri.this.di();
                                        riVar.ri(ri.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + ri.this.lr + "]."));
                                        return;
                                    }
                                }
                            }
                            if (jRi > 0 && ri.this.lr.exists() && ri.this.lr.length() == jRi) {
                                ri riVar3 = ri.this;
                                if (!riVar3.lr.renameTo(riVar3.ri)) {
                                    riVar.ri(ri.this, new IOException("Rename fail"));
                                    return;
                                } else {
                                    lrVar3.ri(ri.this.ri);
                                    riVar.ri(ri.this, lrVar3);
                                    return;
                                }
                            }
                            InputStream inputStream = null;
                            try {
                                randomAccessFile = new RandomAccessFile(ri.this.lr, "rw");
                                try {
                                    if (zFi) {
                                        randomAccessFile.seek(j);
                                        j2 = j;
                                    } else {
                                        randomAccessFile.setLength(0L);
                                        j2 = 0;
                                    }
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                randomAccessFile = null;
                            }
                            try {
                                InputStream inputStreamIk = bgrVar.di().ik();
                                if (ri.xha(map) && !(inputStreamIk instanceof GZIPInputStream)) {
                                    inputStreamIk = new GZIPInputStream(inputStreamIk);
                                }
                                byte[] bArr = new byte[16384];
                                long j4 = 0;
                                int i3 = 0;
                                while (true) {
                                    long j5 = j3;
                                    int i4 = inputStreamIk.read(bArr, i3, 16384 - i3);
                                    if (i4 != -1) {
                                        i3 += i4;
                                        j4 += (long) i4;
                                        if (j4 % Http2Stream.EMIT_BUFFER_SIZE == j5 || j4 == jRi - j) {
                                            randomAccessFile.seek(j2);
                                            randomAccessFile.write(bArr, 0, i3);
                                            j2 += (long) i3;
                                            i3 = 0;
                                        }
                                        if (ri.this.qt) {
                                            throw new IOException("net is cancel");
                                        }
                                        j3 = j5;
                                    } else {
                                        if (i3 != 0) {
                                            randomAccessFile.seek(j2);
                                            randomAccessFile.write(bArr, 0, i3);
                                        }
                                        if (!zFi) {
                                            jRi = ri.this.lr.length();
                                        }
                                        if (jRi > j5 && ri.this.lr.exists() && ri.this.lr.length() == jRi) {
                                            ri riVar4 = ri.this;
                                            if (!riVar4.lr.renameTo(riVar4.ri)) {
                                                riVar.ri(ri.this, new IOException("Rename fail"));
                                            } else {
                                                lrVar3.ri(ri.this.ri);
                                                riVar.ri(ri.this, lrVar3);
                                            }
                                        } else {
                                            com.bytedance.sdk.component.xha.ri.ri riVar5 = riVar;
                                            ri riVar6 = ri.this;
                                            StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                            sb.append(ri.this.lr.length() == jRi);
                                            riVar5.ri(riVar6, new IOException(sb.toString()));
                                        }
                                        try {
                                            inputStreamIk.close();
                                        } catch (Throwable unused3) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                            return;
                                        } catch (Throwable unused4) {
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    riVar.ri(ri.this, new IOException(th.getMessage()));
                                    if (!zFi) {
                                        ri.this.di();
                                    }
                                } finally {
                                    if (0 != 0) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused6) {
                                    }
                                }
                            }
                        } else {
                            riVar.ri(ri.this, lrVar3);
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            riVar.ri(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0139 A[PHI: r10
  0x0139: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:42:0x00ff, B:45:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    public com.bytedance.sdk.component.xha.lr ri() {
        com.bytedance.sdk.component.xha.lr lrVar;
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        ri riVar = this;
        File file = riVar.ri;
        if (file == null || riVar.lr == null) {
            return null;
        }
        if (file.exists() && riVar.ri.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.xha.lr lrVar2 = new com.bytedance.sdk.component.xha.lr(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            lrVar2.ri(riVar.ri);
            return lrVar2;
        }
        long length = riVar.lr.length();
        if (length < 0) {
            length = 0;
        }
        co.ri riVar2 = new co.ri();
        riVar2.ri((Object) riVar.ka());
        riVar.ri(riVar2);
        riVar.lr(Command.HTTP_HEADER_RANGE, "bytes=" + length + "-");
        if (TextUtils.isEmpty(riVar.mj)) {
            return null;
        }
        try {
            riVar2.lr(riVar.mj);
            riVar.lr(riVar2);
            try {
                com.bytedance.sdk.component.lr.ri.lr lrVarRi = riVar.ik.ri(riVar2.ri().lr());
                if (lrVarRi == null) {
                    return null;
                }
                bgr bgrVarLr = lrVarRi.lr();
                if (bgrVarLr != null) {
                    riVar.ri(bgrVarLr.jbs());
                }
                if (bgrVarLr == null || !bgrVarLr.ka()) {
                    return null;
                }
                HashMap map = new HashMap();
                di diVarXha = bgrVarLr.xha();
                if (diVarXha != null) {
                    for (int i = 0; i < diVarXha.ri(); i++) {
                        map.put(diVarXha.ri(i), diVarXha.lr(i));
                    }
                }
                com.bytedance.sdk.component.xha.lr lrVar3 = new com.bytedance.sdk.component.xha.lr(bgrVarLr.ka(), bgrVarLr.ik(), bgrVarLr.fi(), map, null, bgrVarLr.lr(), bgrVarLr.ri());
                long jRi = bgrVarLr.di().ri();
                if (jRi <= 0) {
                    jRi = di(map);
                }
                long length2 = riVar.lr.length();
                boolean zFi = fi(map);
                lrVar = null;
                if (zFi) {
                    jRi += length2;
                    try {
                        String str = (String) map.get("Content-Range");
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (jRi - 1)) == -1) {
                                Objects.toString(riVar.lr);
                                riVar.di();
                                return null;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                if (jRi > r3 && riVar.lr.exists() && riVar.lr.length() == jRi) {
                    if (!riVar.lr.renameTo(riVar.ri)) {
                        return null;
                    }
                    lrVar3.ri(riVar.ri);
                    return lrVar3;
                }
                try {
                    randomAccessFile = new RandomAccessFile(riVar.lr, "rw");
                    try {
                        if (zFi) {
                            randomAccessFile.seek(length);
                            j = length;
                        } else {
                            randomAccessFile.setLength(0L);
                            j = 0;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    randomAccessFile = null;
                }
                try {
                    InputStream inputStreamIk = bgrVarLr.di().ik();
                    try {
                        if (xha(map) && !(inputStreamIk instanceof GZIPInputStream)) {
                            inputStreamIk = new GZIPInputStream(inputStreamIk);
                        }
                        byte[] bArr = new byte[16384];
                        int i2 = 0;
                        long j2 = 0;
                        while (true) {
                            int i3 = inputStreamIk.read(bArr, i2, 16384 - i2);
                            inputStream = inputStreamIk;
                            if (i3 != -1) {
                                i2 += i3;
                                j2 += (long) i3;
                                try {
                                    if (j2 % Http2Stream.EMIT_BUFFER_SIZE == 0 || j2 == jRi - length) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i2);
                                        j += (long) i2;
                                        i2 = 0;
                                    }
                                    riVar = this;
                                    try {
                                        if (riVar.qt) {
                                            throw new IOException("net is cancel");
                                        }
                                        inputStreamIk = inputStream;
                                    } catch (Throwable unused4) {
                                        if (!zFi) {
                                            try {
                                                riVar.di();
                                            } finally {
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable unused5) {
                                                    }
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable unused6) {
                                                }
                                            }
                                        }
                                        return null;
                                    }
                                } catch (Throwable unused7) {
                                    riVar = this;
                                }
                            } else {
                                if (i3 != 0) {
                                    randomAccessFile.seek(j);
                                    randomAccessFile.write(bArr, 0, i2);
                                }
                                if (!zFi || length == 0) {
                                    jRi = riVar.lr.length();
                                }
                                if (jRi > 0 && riVar.lr.exists() && riVar.lr.length() == jRi) {
                                    if (riVar.lr.renameTo(riVar.ri)) {
                                        lrVar3.ri(riVar.ri);
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused8) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused9) {
                                        }
                                        return lrVar3;
                                    }
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused10) {
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused11) {
                                    }
                                    return null;
                                }
                                riVar.lr.length();
                                try {
                                    inputStream.close();
                                } catch (Throwable unused12) {
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused13) {
                                }
                                return null;
                            }
                        }
                    } catch (Throwable unused14) {
                        inputStream = inputStreamIk;
                    }
                } catch (Throwable unused15) {
                    inputStream = null;
                }
            } catch (IOException unused16) {
                lrVar = null;
            }
            riVar.di();
            return lrVar;
        } catch (IllegalArgumentException unused17) {
            return null;
        }
    }
}
