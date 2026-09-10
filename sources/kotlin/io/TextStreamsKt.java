package kotlin.io;

import com.applovin.shadow.okio.Segment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextStreamsKt {
    public static final void a(BufferedReader bufferedReader, Function1 function1) throws IOException {
        try {
            Iterator it = ((ConstrainedOnceSequence) SequencesKt.c(new LinesSequence(bufferedReader))).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final String b(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[Segment.SIZE];
        int i2 = reader.read(cArr);
        while (i2 >= 0) {
            stringWriter.write(cArr, 0, i2);
            i2 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }
}
