package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhyq implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzhxh zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzhxo zzk;
    private String zzl;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            zzb[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzhyq(Writer writer) {
        boolean z2 = false;
        zzm(6);
        this.zzk = zzhxo.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzhxh zzhxhVar = zzhxh.zza;
        Objects.requireNonNull(zzhxhVar);
        this.zzg = zzhxhVar;
        this.zzi = ",";
        if (zzhxhVar.zzc()) {
            this.zzh = ": ";
            if (zzhxhVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        if (zzhxhVar.zza().isEmpty() && zzhxhVar.zzb().isEmpty()) {
            z2 = true;
        }
        this.zzj = z2;
    }

    private final zzhyq zzk(int i2, char c2) throws IOException {
        zzs();
        zzm(i2);
        this.zzd.write(c2);
        return this;
    }

    private final zzhyq zzl(int i2, int i3, char c2) throws IOException {
        int iZzn = zzn();
        if (iZzn != i3 && iZzn != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (iZzn == i3) {
            zzr();
        }
        this.zzd.write(c2);
        return this;
    }

    private final void zzm(int i2) {
        int i3 = this.zzf;
        int[] iArr = this.zze;
        if (i3 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i3 + i3);
        }
        int[] iArr2 = this.zze;
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        iArr2[i4] = i2;
    }

    private final int zzn() {
        int i2 = this.zzf;
        if (i2 != 0) {
            return this.zze[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i2) {
        this.zze[this.zzf - 1] = i2;
    }

    private final void zzp() throws IOException {
        if (this.zzl != null) {
            int iZzn = zzn();
            if (iZzn == 5) {
                this.zzd.write(this.zzi);
            } else if (iZzn != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzr();
            zzo(4);
            zzq(this.zzl);
            this.zzl = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    private final void zzq(String str) throws IOException {
        String str2;
        Writer writer = this.zzd;
        String[] strArr = zzb;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i3 < i2) {
                        writer.write(str, i3, i2 - i3);
                    }
                    writer.write(str2);
                    i3 = i4;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i3 < i2) {
                    writer.write(str, i3, i2 - i3);
                }
                writer.write(str2);
                i3 = i4;
            }
            i2 = i4;
        }
        if (i3 < length) {
            writer.write(str, i3, length - i3);
        }
        writer.write(34);
    }

    private final void zzr() throws IOException {
        if (this.zzj) {
            return;
        }
        Writer writer = this.zzd;
        zzhxh zzhxhVar = this.zzg;
        writer.write(zzhxhVar.zza());
        int i2 = this.zzf;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(zzhxhVar.zzb());
        }
    }

    private final void zzs() throws IOException {
        int iZzn = zzn();
        if (iZzn == 1) {
            zzo(2);
            zzr();
            return;
        }
        if (iZzn == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzr();
        } else {
            if (iZzn == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzo(5);
                return;
            }
            if (iZzn != 6) {
                if (iZzn != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzhxo.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzo(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i2 = this.zzf;
        if (i2 > 1 || (i2 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final void zza(zzhxo zzhxoVar) {
        Objects.requireNonNull(zzhxoVar);
        this.zzk = zzhxoVar;
    }

    public final zzhyq zzb() throws IOException {
        zzp();
        zzk(1, AbstractJsonLexerKt.BEGIN_LIST);
        return this;
    }

    public final zzhyq zzc() throws IOException {
        zzl(1, 2, AbstractJsonLexerKt.END_LIST);
        return this;
    }

    public final zzhyq zzd() throws IOException {
        zzp();
        zzk(3, AbstractJsonLexerKt.BEGIN_OBJ);
        return this;
    }

    public final zzhyq zze() throws IOException {
        zzl(3, 5, AbstractJsonLexerKt.END_OBJ);
        return this;
    }

    public final zzhyq zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZzn = zzn();
        if (iZzn != 3 && iZzn != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzhyq zzg(String str) throws IOException {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final zzhyq zzh(boolean z2) throws IOException {
        zzp();
        zzs();
        this.zzd.write(true != z2 ? "false" : com.p004ironsource.mediationsdk.metadata.a.g);
        return this;
    }

    public final zzhyq zzi(Number number) throws IOException {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzhxo.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                String strValueOf = String.valueOf(cls);
                throw new IllegalArgumentException(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
            }
        }
        zzs();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public final zzhyq zzj() throws IOException {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write(AbstractJsonLexerKt.NULL);
        return this;
    }
}
