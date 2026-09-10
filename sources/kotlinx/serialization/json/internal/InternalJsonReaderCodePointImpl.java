package kotlinx.serialization.json.internal;

import com.applovin.shadow.okio.Utf8;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@JsonFriendModuleApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "<init>", "()V", "exhausted", "", "nextCodePoint", "", "bufferedChar", "", "Ljava/lang/Character;", "read", "buffer", "", "bufferOffset", "count", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InternalJsonReaderCodePointImpl implements InternalJsonReader {
    private Character bufferedChar;

    public abstract boolean exhausted();

    public abstract int nextCodePoint();

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public final int read(char[] buffer, int bufferOffset, int count) {
        int i2;
        Intrinsics.f(buffer, "buffer");
        Character ch = this.bufferedChar;
        if (ch != null) {
            Intrinsics.c(ch);
            buffer[bufferOffset] = ch.charValue();
            this.bufferedChar = null;
            i2 = 1;
        } else {
            i2 = 0;
        }
        while (i2 < count && !exhausted()) {
            int iNextCodePoint = nextCodePoint();
            if (iNextCodePoint <= 65535) {
                buffer[bufferOffset + i2] = (char) iNextCodePoint;
                i2++;
            } else {
                char c2 = (char) ((iNextCodePoint >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                char c3 = (char) ((iNextCodePoint & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                buffer[bufferOffset + i2] = c2;
                int i3 = i2 + 1;
                if (i3 < count) {
                    buffer[i3 + bufferOffset] = c3;
                    i2 += 2;
                } else {
                    this.bufferedChar = Character.valueOf(c3);
                    i2 = i3;
                }
            }
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }
}
