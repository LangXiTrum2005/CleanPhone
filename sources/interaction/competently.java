package interaction;

import com.ironsource.A5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljava/io/File;", "Ljava/nio/charset/Charset;", A5.N, "", "cutely", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "", "formularize", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/io/OutputStream;", "triweekly", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "beachfront", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "wireman", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "Lkotlin/Function1;", "action", "marial", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)V", "", "competently", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class competently extends marial {
    public static /* synthetic */ String apical(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return cutely(file, charset);
    }

    public static final CharsetEncoder beachfront(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final List<String> competently(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        marial(file, charset, new Function1() { // from class: interaction.beachfront
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return competently.taiyuan(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static final String cutely(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strImpromptu = formularize.impromptu(inputStreamReader);
            saneness.attabal(inputStreamReader, null);
            return strImpromptu;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                saneness.attabal(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static void formularize(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            triweekly(fileOutputStream, text, charset);
            Unit unit = Unit.f29295attabal;
            saneness.attabal(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                saneness.attabal(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void impassible(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        formularize(file, str, charset);
    }

    public static /* synthetic */ List impromptu(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return competently(file, charset);
    }

    public static final void marial(File file, Charset charset, Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        formularize.wireman(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final Unit taiyuan(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return Unit.f29295attabal;
    }

    public static final void triweekly(OutputStream outputStream, String text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderBeachfront = beachfront(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        Intrinsics.beachfront(charsetEncoderBeachfront);
        ByteBuffer byteBufferWireman = wireman(8192, charsetEncoderBeachfront);
        int i = 0;
        int i2 = 0;
        while (i < text.length()) {
            int iMin = Math.min(8192 - i2, text.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderBeachfront.encode(charBufferAllocate, byteBufferWireman, i3 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferWireman.array(), 0, byteBufferWireman.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferWireman.clear();
            i = i3;
        }
    }

    public static final ByteBuffer wireman(int i, CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }
}
