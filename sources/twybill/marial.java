package twybill;

import com.ironsource.X3;
import java.io.File;

/* JADX INFO: compiled from: CacheSpan.java */
/* JADX INFO: loaded from: classes.dex */
public class marial implements Comparable<marial> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long f39029arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final long f39030graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final String f39031kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final File f39032molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final long f39033monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f39034polloi;

    public marial(String str, long j, long j2, long j3, File file) {
        this.f39031kowloon = str;
        this.f39029arytenoidectomy = j;
        this.f39033monoploid = j2;
        this.f39034polloi = file != null;
        this.f39032molybdenite = file;
        this.f39030graveside = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public int compareTo(marial marialVar) {
        if (!this.f39031kowloon.equals(marialVar.f39031kowloon)) {
            return this.f39031kowloon.compareTo(marialVar.f39031kowloon);
        }
        long j = this.f39029arytenoidectomy - marialVar.f39029arytenoidectomy;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public boolean dern() {
        return !this.f39034polloi;
    }

    public String toString() {
        return X3.j.d + this.f39029arytenoidectomy + ", " + this.f39033monoploid + X3.j.e;
    }

    public boolean wireman() {
        return this.f39033monoploid == -1;
    }
}
