package lerp;

/* JADX INFO: compiled from: Schlick.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan extends dern {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public double f32854marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public double f32855wireman;

    public taiyuan(String str) {
        this.f32796attabal = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f32855wireman = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f32854marial = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // lerp.dern
    public double attabal(double d) {
        return marial(d);
    }

    public final double marial(double d) {
        double d2 = this.f32854marial;
        return d < d2 ? (d2 * d) / (d + (this.f32855wireman * (d2 - d))) : ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f32855wireman * (d2 - d)));
    }

    @Override // lerp.dern
    public double saneness(double d) {
        return wireman(d);
    }

    public final double wireman(double d) {
        double d2 = this.f32854marial;
        if (d < d2) {
            double d3 = this.f32855wireman;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f32855wireman;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }
}
