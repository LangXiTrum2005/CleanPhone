package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import glutethimide.kowloon;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements dern, com.bumptech.glide.load.data.wireman.attabal<Object> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f17767adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final wireman<?> f17768arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public volatile kowloon.attabal<?> f17769dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public File f17770gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public List<kowloon<File, ?>> f17771graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<maggot.saneness> f17772kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public maggot.saneness f17773molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final dern.attabal f17774monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f17775polloi;

    public saneness(wireman<?> wiremanVar, dern.attabal attabalVar) {
        this(wiremanVar.dern(), wiremanVar, attabalVar);
    }

    private boolean attabal() {
        return this.f17767adultoid < this.f17771graveside.size();
    }

    @Override // com.bumptech.glide.load.data.wireman.attabal
    public void beachfront(Object obj) {
        this.f17774monoploid.attabal(this.f17773molybdenite, obj, this.f17769dovishness.f27251dern, DataSource.DATA_DISK_CACHE, this.f17773molybdenite);
    }

    @Override // com.bumptech.glide.load.engine.dern
    public void cancel() {
        kowloon.attabal<?> attabalVar = this.f17769dovishness;
        if (attabalVar != null) {
            attabalVar.f27251dern.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.wireman.attabal
    public void dern(Exception exc) {
        this.f17774monoploid.dern(this.f17773molybdenite, exc, this.f17769dovishness.f27251dern, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.dern
    public boolean saneness() {
        naming.saneness.attabal("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f17771graveside != null && attabal()) {
                    this.f17769dovishness = null;
                    while (!z && attabal()) {
                        List<kowloon<File, ?>> list = this.f17771graveside;
                        int i = this.f17767adultoid;
                        this.f17767adultoid = i + 1;
                        this.f17769dovishness = list.get(i).saneness(this.f17770gintrap, this.f17768arytenoidectomy.graveside(), this.f17768arytenoidectomy.beachfront(), this.f17768arytenoidectomy.apical());
                        if (this.f17769dovishness != null && this.f17768arytenoidectomy.adultoid(this.f17769dovishness.f27251dern.attabal())) {
                            this.f17769dovishness.f27251dern.marial(this.f17768arytenoidectomy.formularize(), this);
                            z = true;
                        }
                    }
                    naming.saneness.marial();
                    return z;
                }
                int i2 = this.f17775polloi + 1;
                this.f17775polloi = i2;
                if (i2 >= this.f17772kowloon.size()) {
                    naming.saneness.marial();
                    return false;
                }
                maggot.saneness sanenessVar = this.f17772kowloon.get(this.f17775polloi);
                File fileAttabal = this.f17768arytenoidectomy.wireman().attabal(new endosteum.attabal(sanenessVar, this.f17768arytenoidectomy.arytenoidectomy()));
                this.f17770gintrap = fileAttabal;
                if (fileAttabal != null) {
                    this.f17773molybdenite = sanenessVar;
                    this.f17771graveside = this.f17768arytenoidectomy.cutely(fileAttabal);
                    this.f17767adultoid = 0;
                }
            } catch (Throwable th) {
                naming.saneness.marial();
                throw th;
            }
        }
    }

    public saneness(List<maggot.saneness> list, wireman<?> wiremanVar, dern.attabal attabalVar) {
        this.f17775polloi = -1;
        this.f17772kowloon = list;
        this.f17768arytenoidectomy = wiremanVar;
        this.f17774monoploid = attabalVar;
    }
}
