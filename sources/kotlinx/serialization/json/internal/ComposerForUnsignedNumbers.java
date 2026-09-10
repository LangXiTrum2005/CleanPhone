package kotlinx.serialization.json.internal;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(InternalJsonWriter writer, boolean z2) {
        super(writer);
        Intrinsics.f(writer, "writer");
        this.forceQuoting = z2;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v) {
        if (this.forceQuoting) {
            printQuoted(Long.toString(4294967295L & ((long) v), 10));
        } else {
            print(Long.toString(4294967295L & ((long) v), 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v) {
        int i2 = 63;
        String str = "0";
        if (this.forceQuoting) {
            if (v != 0) {
                if (v > 0) {
                    str = Long.toString(v, 10);
                } else {
                    char[] cArr = new char[64];
                    long j = (v >>> 1) / ((long) 5);
                    long j2 = 10;
                    cArr[63] = Character.forDigit((int) (v - (j * j2)), 10);
                    while (j > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j % j2), 10);
                        j /= j2;
                    }
                    str = new String(cArr, i2, 64 - i2);
                }
            }
            printQuoted(str);
            return;
        }
        if (v != 0) {
            if (v > 0) {
                str = Long.toString(v, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (v >>> 1) / ((long) 5);
                long j4 = 10;
                cArr2[63] = Character.forDigit((int) (v - (j3 * j4)), 10);
                while (j3 > 0) {
                    i2--;
                    cArr2[i2] = Character.forDigit((int) (j3 % j4), 10);
                    j3 /= j4;
                }
                str = new String(cArr2, i2, 64 - i2);
            }
        }
        print(str);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v) {
        if (this.forceQuoting) {
            printQuoted(String.valueOf(v & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        } else {
            print(String.valueOf(v & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v) {
        if (this.forceQuoting) {
            printQuoted(String.valueOf(v & 65535));
        } else {
            print(String.valueOf(v & 65535));
        }
    }
}
