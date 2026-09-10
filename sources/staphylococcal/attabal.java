package staphylococcal;

import com.google.android.datatransport.Priority;

/* JADX INFO: compiled from: AutoValue_Event.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal<T> extends wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Integer f38057attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Priority f38058dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final T f38059saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final beachfront f38060wireman;

    public attabal(Integer num, T t, Priority priority, beachfront beachfrontVar, marial marialVar) {
        this.f38057attabal = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.f38059saneness = t;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f38058dern = priority;
        this.f38060wireman = beachfrontVar;
    }

    @Override // staphylococcal.wireman
    public Integer attabal() {
        return this.f38057attabal;
    }

    @Override // staphylococcal.wireman
    public T dern() {
        return this.f38059saneness;
    }

    public boolean equals(Object obj) {
        beachfront beachfrontVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wireman) {
            wireman wiremanVar = (wireman) obj;
            Integer num = this.f38057attabal;
            if (num != null ? num.equals(wiremanVar.attabal()) : wiremanVar.attabal() == null) {
                if (this.f38059saneness.equals(wiremanVar.dern()) && this.f38058dern.equals(wiremanVar.wireman()) && ((beachfrontVar = this.f38060wireman) != null ? beachfrontVar.equals(wiremanVar.marial()) : wiremanVar.marial() == null)) {
                    wiremanVar.saneness();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f38057attabal;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f38059saneness.hashCode()) * 1000003) ^ this.f38058dern.hashCode()) * 1000003;
        beachfront beachfrontVar = this.f38060wireman;
        return (iHashCode ^ (beachfrontVar != null ? beachfrontVar.hashCode() : 0)) * 1000003;
    }

    @Override // staphylococcal.wireman
    public beachfront marial() {
        return this.f38060wireman;
    }

    @Override // staphylococcal.wireman
    public marial saneness() {
        return null;
    }

    public String toString() {
        return "Event{code=" + this.f38057attabal + ", payload=" + this.f38059saneness + ", priority=" + this.f38058dern + ", productData=" + this.f38060wireman + ", eventContext=" + ((Object) null) + "}";
    }

    @Override // staphylococcal.wireman
    public Priority wireman() {
        return this.f38058dern;
    }
}
