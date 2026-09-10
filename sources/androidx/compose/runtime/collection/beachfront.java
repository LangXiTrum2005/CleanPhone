package androidx.compose.runtime.collection;

import androidx.collection.grimness;
import androidx.collection.peridotite;
import androidx.collection.saran;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScopeMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/collection/beachfront;", "", "Key", "Scope", "Landroidx/collection/grimness;", "map", "dern", "(Landroidx/collection/grimness;)Landroidx/collection/grimness;", X3.i.W, "scope", "", "attabal", "(Landroidx/collection/grimness;Ljava/lang/Object;Ljava/lang/Object;)V", "value", "taiyuan", "element", "", "marial", "(Landroidx/collection/grimness;Ljava/lang/Object;)Z", "saneness", "(Landroidx/collection/grimness;)V", "competently", "(Landroidx/collection/grimness;Ljava/lang/Object;Ljava/lang/Object;)Z", "impromptu", "(Landroidx/collection/grimness;Ljava/lang/Object;)V", "", "beachfront", "(Landroidx/collection/grimness;)I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class beachfront<Key, Scope> {
    public static final void attabal(grimness<Object, Object> grimnessVar, Key key, Scope scope) {
        int iFormularize = grimnessVar.formularize(key);
        int i = 0;
        int i2 = 1;
        boolean z = iFormularize < 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj = z ? null : grimnessVar.values[iFormularize];
        if (obj != null) {
            if (obj instanceof saran) {
                Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((saran) obj).impromptu(scope);
            } else if (obj != scope) {
                saran saranVar = new saran(i, i2, defaultConstructorMarker);
                Intrinsics.competently(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                saranVar.impromptu(obj);
                saranVar.impromptu(scope);
                scope = (Scope) saranVar;
            }
            scope = (Scope) obj;
        }
        if (!z) {
            grimnessVar.values[iFormularize] = scope;
            return;
        }
        int i3 = ~iFormularize;
        grimnessVar.keys[i3] = key;
        grimnessVar.values[i3] = scope;
    }

    public static final int beachfront(grimness<Object, Object> grimnessVar) {
        return grimnessVar.get_size();
    }

    public static final boolean competently(grimness<Object, Object> grimnessVar, Key key, Scope scope) {
        Object objDern = grimnessVar.dern(key);
        if (objDern == null) {
            return false;
        }
        if (!(objDern instanceof saran)) {
            if (!Intrinsics.wireman(objDern, scope)) {
                return false;
            }
            grimnessVar.monoploid(key);
            return true;
        }
        saran saranVar = (saran) objDern;
        boolean zPreprohormone = saranVar.preprohormone(scope);
        if (zPreprohormone && saranVar.wireman()) {
            grimnessVar.monoploid(key);
        }
        return zPreprohormone;
    }

    public static final void impromptu(grimness<Object, Object> grimnessVar, Scope scope) {
        boolean zWireman;
        long[] jArr = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = grimnessVar.keys[i4];
                        Object obj2 = grimnessVar.values[i4];
                        if (obj2 instanceof saran) {
                            Intrinsics.competently(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            saran saranVar = (saran) obj2;
                            saranVar.preprohormone(scope);
                            zWireman = saranVar.wireman();
                        } else {
                            zWireman = obj2 == scope;
                        }
                        if (zWireman) {
                            grimnessVar.polloi(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean marial(grimness<Object, Object> grimnessVar, Key key) {
        return grimnessVar.saneness(key);
    }

    public static final void saneness(grimness<Object, Object> grimnessVar) {
        grimnessVar.taiyuan();
    }

    public static final void taiyuan(grimness<Object, Object> grimnessVar, Key key, Scope scope) {
        grimnessVar.graveside(key, scope);
    }

    public static /* synthetic */ grimness wireman(grimness grimnessVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            grimnessVar = peridotite.dern();
        }
        return dern(grimnessVar);
    }

    public static <Key, Scope> grimness<Object, Object> dern(grimness<Object, Object> grimnessVar) {
        return grimnessVar;
    }
}
