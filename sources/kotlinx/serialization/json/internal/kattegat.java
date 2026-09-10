package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkotlinx/serialization/json/internal/kattegat;", "Lkotlinx/serialization/json/internal/dern;", "Lcutwater/attabal;", "json", "Lcutwater/trm;", "value", "", "polymorphicDiscriminator", "Lbristol/beachfront;", "polyDescriptor", "<init>", "(Lcutwater/attabal;Lcutwater/trm;Ljava/lang/String;Lbristol/beachfront;)V", "descriptor", "", "impassible", "(Lbristol/beachfront;)I", "", "trm", "()Z", "index", "itchy", "(Lbristol/beachfront;I)Ljava/lang/String;", "tag", "Lcutwater/impromptu;", "empress", "(Ljava/lang/String;)Lcutwater/impromptu;", "Lfastidiously/dern;", "saneness", "(Lbristol/beachfront;)Lfastidiously/dern;", "", "dern", "(Lbristol/beachfront;)V", "herdbook", "(Lbristol/beachfront;ILjava/lang/String;)Z", "hardpan", "(Lbristol/beachfront;I)Z", "Lcutwater/trm;", "technofreak", "()Lcutwater/trm;", "beachfront", "Lbristol/beachfront;", "competently", "I", X3.i.L, "impromptu", "Z", "forceNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class kattegat extends dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront polyDescriptor;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean forceNull;
    private final cutwater.trm value;

    public /* synthetic */ kattegat(cutwater.attabal attabalVar, cutwater.trm trmVar, String str, bristol.beachfront beachfrontVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, trmVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : beachfrontVar);
    }

    @Override // kotlinx.serialization.json.internal.dern, fastidiously.dern
    public void dern(bristol.beachfront descriptor) {
        Set<String> setApical;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.configuration.getIgnoreUnknownKeys() || (descriptor.getKind() instanceof bristol.wireman)) {
            return;
        }
        cuirassed.impassible(descriptor, getJson());
        if (this.configuration.getUseAlternativeNames()) {
            Set<String> setAttabal = vinyl.overspeculate.attabal(descriptor);
            Map map = (Map) cutwater.supplicat.attabal(getJson()).attabal(descriptor, cuirassed.competently());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = p002kotlin.collections.creditor.marial();
            }
            setApical = p002kotlin.collections.starveling.apical(setAttabal, setKeySet);
        } else {
            setApical = vinyl.overspeculate.attabal(descriptor);
        }
        for (String str : getValue().keySet()) {
            if (!setApical.contains(str) && !Intrinsics.wireman(str, getPolymorphicDiscriminator())) {
                throw preprohormone.competently(str, getValue().toString());
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.dern
    public cutwater.impromptu empress(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (cutwater.impromptu) p002kotlin.collections.seminary.cutely(getValue(), tag);
    }

    public final boolean hardpan(bristol.beachfront descriptor, int index) {
        boolean z = (getJson().getConfiguration().getExplicitNulls() || descriptor.taiyuan(index) || !descriptor.competently(index).saneness()) ? false : true;
        this.forceNull = z;
        return z;
    }

    public final boolean herdbook(bristol.beachfront descriptor, int index, String tag) {
        cutwater.attabal json = getJson();
        boolean zTaiyuan = descriptor.taiyuan(index);
        bristol.beachfront beachfrontVarCompetently = descriptor.competently(index);
        if (zTaiyuan && !beachfrontVarCompetently.saneness() && (empress(tag) instanceof cutwater.cord)) {
            return true;
        }
        if (!Intrinsics.wireman(beachfrontVarCompetently.getKind(), bristol.impassible.saneness.f15156attabal) || (beachfrontVarCompetently.saneness() && (empress(tag) instanceof cutwater.cord))) {
            return false;
        }
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        cutwater.sealless seallessVar = impromptuVarEmpress instanceof cutwater.sealless ? (cutwater.sealless) impromptuVarEmpress : null;
        String strBeachfront = seallessVar != null ? cutwater.cutely.beachfront(seallessVar) : null;
        if (strBeachfront == null) {
            return false;
        }
        return cuirassed.taiyuan(beachfrontVarCompetently, json, strBeachfront) == -3 && (zTaiyuan || (!json.getConfiguration().getExplicitNulls() && beachfrontVarCompetently.saneness()));
    }

    @Override // fastidiously.dern
    public int impassible(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            String strPermissivist = permissivist(descriptor, i);
            int i2 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey(strPermissivist) || hardpan(descriptor, i2)) {
                if (!this.configuration.getCoerceInputValues() || !herdbook(descriptor, i2, strPermissivist)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // vinyl.czestochowa
    public String itchy(bristol.beachfront descriptor, int index) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        cuirassed.impassible(descriptor, getJson());
        String strMarial = descriptor.marial(index);
        if (!this.configuration.getUseAlternativeNames() || getValue().keySet().contains(strMarial)) {
            return strMarial;
        }
        Map<String, Integer> mapMarial = cuirassed.marial(getJson(), descriptor);
        Iterator<T> it = getValue().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapMarial.get((String) next);
            if (num != null && num.intValue() == index) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strMarial;
    }

    @Override // kotlinx.serialization.json.internal.dern, fastidiously.marial
    public fastidiously.dern saneness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.polyDescriptor) {
            return super.saneness(descriptor);
        }
        cutwater.attabal json = getJson();
        cutwater.impromptu impromptuVarCoi = coi();
        String serialName = this.polyDescriptor.getSerialName();
        if (impromptuVarCoi instanceof cutwater.trm) {
            return new kattegat(json, (cutwater.trm) impromptuVarCoi, getPolymorphicDiscriminator(), this.polyDescriptor);
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.trm.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarCoi.getClass()).taiyuan() + " as the serialized body of " + serialName + " at element: " + nosophobia(), impromptuVarCoi.toString());
    }

    @Override // kotlinx.serialization.json.internal.dern
    /* JADX INFO: renamed from: technofreak, reason: from getter */
    public cutwater.trm getValue() {
        return this.value;
    }

    @Override // kotlinx.serialization.json.internal.dern, fastidiously.marial
    public boolean trm() {
        return !this.forceNull && super.trm();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kattegat(cutwater.attabal json, cutwater.trm value, String str, bristol.beachfront beachfrontVar) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDescriptor = beachfrontVar;
    }
}
