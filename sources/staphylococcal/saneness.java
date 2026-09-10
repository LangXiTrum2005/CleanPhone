package staphylococcal;

/* JADX INFO: compiled from: AutoValue_ProductData.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness extends beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Integer f38061attabal;

    public saneness(Integer num) {
        this.f38061attabal = num;
    }

    @Override // staphylococcal.beachfront
    public Integer attabal() {
        return this.f38061attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof beachfront)) {
            return false;
        }
        Integer num = this.f38061attabal;
        Integer numAttabal = ((beachfront) obj).attabal();
        if (num == null) {
            return numAttabal == null;
        }
        return num.equals(numAttabal);
    }

    public int hashCode() {
        Integer num = this.f38061attabal;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f38061attabal + "}";
    }
}
