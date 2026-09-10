package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
class QueueFileLogStore implements FileLogStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f20404c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f20405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QueueFile f20406b;

    public static class LogBytes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f20409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20410b;

        public LogBytes(byte[] bArr, int i2) {
            this.f20409a = bArr;
            this.f20410b = i2;
        }
    }

    public QueueFileLogStore(File file) {
        this.f20405a = file;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void a() {
        CommonUtils.b(this.f20406b, "There was a problem closing the Crashlytics log file.");
        this.f20406b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final String b() {
        LogBytes logBytes;
        byte[] bArr = null;
        if (this.f20405a.exists()) {
            d();
            QueueFile queueFile = this.f20406b;
            if (queueFile == null) {
                logBytes = null;
            } else {
                final int[] iArr = {0};
                final byte[] bArr2 = new byte[queueFile.p()];
                try {
                    this.f20406b.d(new QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                        public final void a(InputStream inputStream, int i2) throws IOException {
                            int[] iArr2 = iArr;
                            try {
                                inputStream.read(bArr2, iArr2[0], i2);
                                iArr2[0] = iArr2[0] + i2;
                            } finally {
                                inputStream.close();
                            }
                        }
                    });
                } catch (IOException e2) {
                    Logger.f20289a.c(e2, "A problem occurred while reading the Crashlytics log file.");
                }
                logBytes = new LogBytes(bArr2, iArr[0]);
            }
        } else {
            logBytes = null;
        }
        if (logBytes != null) {
            int i2 = logBytes.f20410b;
            bArr = new byte[i2];
            System.arraycopy(logBytes.f20409a, 0, bArr, 0, i2);
        }
        if (bArr != null) {
            return new String(bArr, f20404c);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void c(long j, String str) {
        d();
        if (this.f20406b == null) {
            return;
        }
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f20406b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ")).getBytes(f20404c));
            while (!this.f20406b.h() && this.f20406b.p() > 65536) {
                this.f20406b.k();
            }
        } catch (IOException e2) {
            Logger.f20289a.c(e2, "There was a problem writing to the Crashlytics log.");
        }
    }

    public final void d() {
        File file = this.f20405a;
        if (this.f20406b == null) {
            try {
                this.f20406b = new QueueFile(file);
            } catch (IOException e2) {
                Logger.f20289a.c(e2, "Could not open log file: " + file);
            }
        }
    }
}
