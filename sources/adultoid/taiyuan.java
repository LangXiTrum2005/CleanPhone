package adultoid;

import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.immediately;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;

/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0007\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010$\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(R\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0012\u0010*\u0012\u0004\b+\u0010\u0003R\u0016\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0016\u00101\u001a\u00020/8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0016\u00102\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030)8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0011\u0010:\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u00109¨\u0006;"}, d2 = {"Ladultoid/taiyuan;", "Ladultoid/cutely;", "<init>", "()V", "", "currentSize", "requiredSize", "saneness", "(II)I", "", "impassible", "apical", "(II)V", "formularize", "", "beachfront", "()Z", "competently", "attabal", "Ladultoid/wireman;", "operation", "cutely", "(Ladultoid/wireman;)V", "taiyuan", "dern", C3414a2.d, "impromptu", "(Ladultoid/taiyuan;)V", "Landroidx/compose/runtime/wireman;", "applier", "Landroidx/compose/runtime/cig;", "slots", "Landroidx/compose/runtime/immediately;", "rememberManager", "Ladultoid/beachfront;", "errorContext", "wireman", "(Landroidx/compose/runtime/wireman;Landroidx/compose/runtime/cig;Landroidx/compose/runtime/immediately;Ladultoid/beachfront;)V", "", "toString", "()Ljava/lang/String;", "", "[Ladultoid/wireman;", "getOpCodes$runtime$annotations", "opCodes", "I", "opCodesSize", "", "[I", "intArgs", "intArgsSize", "", "marial", "[Ljava/lang/Object;", "objectArgs", "objectArgsSize", "pushedIntMask", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class taiyuan extends cutely {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int objectArgsSize;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int pushedIntMask;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int opCodesSize;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int intArgsSize;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public wireman[] opCodes = new wireman[16];

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int[] intArgs = new int[16];

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Object[] objectArgs = new Object[16];

    /* JADX INFO: compiled from: Operations.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Ladultoid/taiyuan$attabal;", "Ladultoid/marial;", "<init>", "(Ladultoid/taiyuan;)V", "", "dern", "()Z", "", "Landroidx/compose/runtime/changelist/IntParameter;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "getInt", "(I)I", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ladultoid/wireman$polloi;", "attabal", "(I)Ljava/lang/Object;", "I", "opIdx", "saneness", "intIdx", "objIdx", "Ladultoid/wireman;", "()Ladultoid/wireman;", "operation", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class attabal implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public int opIdx;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public int objIdx;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public int intIdx;

        public attabal() {
        }

        @Override // adultoid.marial
        public <T> T attabal(int parameter) {
            return (T) taiyuan.this.objectArgs[this.objIdx + parameter];
        }

        public final boolean dern() {
            if (this.opIdx >= taiyuan.this.opCodesSize) {
                return false;
            }
            wireman wiremanVarSaneness = saneness();
            this.intIdx += wiremanVarSaneness.getInts();
            this.objIdx += wiremanVarSaneness.getObjects();
            int i = this.opIdx + 1;
            this.opIdx = i;
            return i < taiyuan.this.opCodesSize;
        }

        @Override // adultoid.marial
        public int getInt(int parameter) {
            return taiyuan.this.intArgs[this.intIdx + parameter];
        }

        public final wireman saneness() {
            return taiyuan.this.opCodes[this.opIdx];
        }
    }

    public final void apical(int currentSize, int requiredSize) {
        int[] iArr = new int[saneness(currentSize, requiredSize)];
        arytenoidectomy.competently(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    public final void attabal() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        arytenoidectomy.molybdenite(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final boolean beachfront() {
        return getOpCodesSize() == 0;
    }

    public final boolean competently() {
        return getOpCodesSize() != 0;
    }

    public final void cutely(wireman operation) {
        if (this.opCodesSize == this.opCodes.length) {
            impassible();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            apical(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            formularize(length2, objects);
        }
        wireman[] wiremanVarArr = this.opCodes;
        int i = this.opCodesSize;
        this.opCodesSize = i + 1;
        wiremanVarArr[i] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    public final void dern(wireman operation) {
        int i = this.pushedIntMask;
        int ints = operation.getInts();
        if (i == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void formularize(int currentSize, int requiredSize) {
        Object[] objArr = new Object[saneness(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    public final void impassible() {
        int iCompetently = p002kotlin.ranges.wireman.competently(this.opCodesSize, 1024);
        int i = this.opCodesSize;
        wireman[] wiremanVarArr = new wireman[iCompetently + i];
        System.arraycopy(this.opCodes, 0, wiremanVarArr, 0, i);
        this.opCodes = wiremanVarArr;
    }

    public final void impromptu(taiyuan other) {
        wireman[] wiremanVarArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        wireman wiremanVar = wiremanVarArr[i];
        wiremanVarArr[i] = null;
        other.cutely(wiremanVar);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - wiremanVar.getObjects();
        int objects2 = this.objectArgsSize - wiremanVar.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        arytenoidectomy.molybdenite(this.objectArgs, null, this.objectArgsSize - wiremanVar.getObjects(), this.objectArgsSize);
        arytenoidectomy.competently(this.intArgs, other.intArgs, other.intArgsSize - wiremanVar.getInts(), this.intArgsSize - wiremanVar.getInts(), this.intArgsSize);
        this.objectArgsSize -= wiremanVar.getObjects();
        this.intArgsSize -= wiremanVar.getInts();
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final int saneness(int currentSize, int requiredSize) {
        return p002kotlin.ranges.wireman.wireman(currentSize + p002kotlin.ranges.wireman.competently(currentSize, 1024), requiredSize);
    }

    public final void taiyuan(wireman operation) {
        cutely(operation);
    }

    @patroclinal.wireman
    public String toString() {
        return super.toString();
    }

    public final void wireman(androidx.compose.runtime.wireman<?> applier, SlotWriter slots, immediately rememberManager, beachfront errorContext) throws Throwable {
        if (competently()) {
            attabal attabalVar = new attabal();
            while (true) {
                androidx.compose.runtime.wireman<?> wiremanVar = applier;
                SlotWriter slotWriter = slots;
                immediately immediatelyVar = rememberManager;
                beachfront beachfrontVar = errorContext;
                attabalVar.saneness().saneness(attabalVar, wiremanVar, slotWriter, immediatelyVar, beachfrontVar);
                if (!attabalVar.dern()) {
                    break;
                }
                applier = wiremanVar;
                slots = slotWriter;
                rememberManager = immediatelyVar;
                errorContext = beachfrontVar;
            }
        }
        attabal();
    }

    /* JADX INFO: compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013Ja\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0002¢\u0006\u0004\b\u0017\u0010\u0018J}\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0014\"\u0004\b\u0003\u0010\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u001b\u001a\u00028\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Ladultoid/taiyuan$saneness;", "", "Ladultoid/taiyuan;", "stack", "attabal", "(Ladultoid/taiyuan;)Ladultoid/taiyuan;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ladultoid/wireman$polloi;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "value", "", "saneness", "(Ladultoid/taiyuan;ILjava/lang/Object;)V", "U", "parameter1", "value1", "parameter2", "value2", "dern", "(Ladultoid/taiyuan;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "parameter3", "value3", "marial", "(Ladultoid/taiyuan;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "wireman", "(Ladultoid/taiyuan;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness {
        public static final <T, U> void dern(taiyuan taiyuanVar, int i, T t, int i2, U u) {
            int objects = taiyuanVar.objectArgsSize - taiyuanVar.opCodes[taiyuanVar.opCodesSize - 1].getObjects();
            Object[] objArr = taiyuanVar.objectArgs;
            objArr[i + objects] = t;
            objArr[objects + i2] = u;
        }

        public static final <T, U, V> void marial(taiyuan taiyuanVar, int i, T t, int i2, U u, int i3, V v) {
            int objects = taiyuanVar.objectArgsSize - taiyuanVar.opCodes[taiyuanVar.opCodesSize - 1].getObjects();
            Object[] objArr = taiyuanVar.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[objects + i3] = v;
        }

        public static final <T> void saneness(taiyuan taiyuanVar, int i, T t) {
            taiyuanVar.objectArgs[(taiyuanVar.objectArgsSize - taiyuanVar.opCodes[taiyuanVar.opCodesSize - 1].getObjects()) + i] = t;
        }

        public static final <T, U, V, W> void wireman(taiyuan taiyuanVar, int i, T t, int i2, U u, int i3, V v, int i4, W w) {
            int objects = taiyuanVar.objectArgsSize - taiyuanVar.opCodes[taiyuanVar.opCodesSize - 1].getObjects();
            Object[] objArr = taiyuanVar.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[i3 + objects] = v;
            objArr[objects + i4] = w;
        }

        public static taiyuan attabal(taiyuan taiyuanVar) {
            return taiyuanVar;
        }
    }
}
