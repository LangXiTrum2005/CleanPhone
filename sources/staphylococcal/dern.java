package staphylococcal;

/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern {
    private final String name;

    public dern(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.name = str;
    }

    public static dern saneness(String str) {
        return new dern(str);
    }

    public String attabal() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dern) {
            return this.name.equals(((dern) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.name + "\"}";
    }
}
