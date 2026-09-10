package stratoscope;

import androidx.collection.grimness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R*\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R2\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00150\u0014\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lstratoscope/dern;", "Lstratoscope/saneness;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "value", "saneness", "(Ljava/lang/Object;)Z", "attabal", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Landroidx/collection/grimness;", "Landroidx/collection/grimness;", "", "Lkotlin/Function0;", "dern", "valueProviders", "runtime-saveable"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Boolean> canBeSaved;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public grimness<String, List<Function0<Object>>> valueProviders;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final grimness<String, List<Object>> restored;

    public dern(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        this.canBeSaved = function1;
        this.restored = (map == null || map.isEmpty()) ? null : marial.beachfront(map);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    @Override // stratoscope.saneness
    public Map<String, List<Object>> attabal() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        grimness<String, List<Object>> grimnessVar = this.restored;
        if (grimnessVar == null && this.valueProviders == null) {
            return seminary.taiyuan();
        }
        int i3 = 0;
        int i4 = grimnessVar != null ? grimnessVar.get_size() : 0;
        grimness<String, List<Function0<Object>>> grimnessVar2 = this.valueProviders;
        HashMap map = new HashMap(i4 + (grimnessVar2 != null ? grimnessVar2.get_size() : 0));
        grimness<String, List<Object>> grimnessVar3 = this.restored;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (grimnessVar3 != null) {
            Object[] objArr = grimnessVar3.keys;
            Object[] objArr2 = grimnessVar3.values;
            long[] jArr3 = grimnessVar3.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        grimness<String, List<Function0<Object>>> grimnessVar4 = this.valueProviders;
        if (grimnessVar4 != null) {
            Object[] objArr3 = grimnessVar4.keys;
            Object[] objArr4 = grimnessVar4.values;
            long[] jArr4 = grimnessVar4.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!saneness(objInvoke)) {
                                            throw new IllegalStateException(attabal.attabal(objInvoke).toString());
                                        }
                                        map.put(str, adultoid.competently(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !saneness(objInvoke2)) {
                                            throw new IllegalStateException(attabal.attabal(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    public boolean saneness(Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }
}
