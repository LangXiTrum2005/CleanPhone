package androidx.room;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DatabaseConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final boolean f13558apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final iconoclasm.dern.InterfaceC0641dern f13559attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final RoomDatabase.JournalMode f13560beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Executor f13561competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final boolean f13562cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final RoomDatabase.dern f13563dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final Set<Integer> f13564formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final String f13565impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Executor f13566impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f13567marial;
    public final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f13568saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final boolean f13569taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final File f13570triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<RoomDatabase.saneness> f13571wireman;

    public attabal(Context context, String str, iconoclasm.dern.InterfaceC0641dern interfaceC0641dern, RoomDatabase.dern dernVar, List<RoomDatabase.saneness> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f13559attabal = interfaceC0641dern;
        this.f13568saneness = context;
        this.name = str;
        this.f13563dern = dernVar;
        this.f13571wireman = list;
        this.f13567marial = z;
        this.f13560beachfront = journalMode;
        this.f13561competently = executor;
        this.f13566impromptu = executor2;
        this.f13569taiyuan = z2;
        this.f13562cutely = z3;
        this.f13558apical = z4;
        this.f13564formularize = set;
        this.f13565impassible = str2;
        this.f13570triweekly = file;
    }

    public boolean attabal(int i, int i2) {
        Set<Integer> set;
        return (i <= i2 || !this.f13558apical) && this.f13562cutely && ((set = this.f13564formularize) == null || !set.contains(Integer.valueOf(i)));
    }
}
