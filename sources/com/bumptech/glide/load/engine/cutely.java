package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import glutethimide.kowloon;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class cutely implements dern, com.bumptech.glide.load.data.wireman.attabal<Object> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f17745adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final wireman<?> f17746arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public volatile kowloon.attabal<?> f17747dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public File f17748gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public List<kowloon<File, ?>> f17749graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final dern.attabal f17750kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public maggot.saneness f17751molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f17752monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f17753polloi = -1;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public endosteum.apical f17754rotuma;

    public cutely(wireman<?> wiremanVar, dern.attabal attabalVar) {
        this.f17746arytenoidectomy = wiremanVar;
        this.f17750kowloon = attabalVar;
    }

    private boolean attabal() {
        return this.f17745adultoid < this.f17749graveside.size();
    }

    @Override // com.bumptech.glide.load.data.wireman.attabal
    public void beachfront(Object obj) {
        this.f17750kowloon.attabal(this.f17751molybdenite, obj, this.f17747dovishness.f27251dern, DataSource.RESOURCE_DISK_CACHE, this.f17754rotuma);
    }

    @Override // com.bumptech.glide.load.engine.dern
    public void cancel() {
        kowloon.attabal<?> attabalVar = this.f17747dovishness;
        if (attabalVar != null) {
            attabalVar.f27251dern.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.wireman.attabal
    public void dern(Exception exc) {
        this.f17750kowloon.dern(this.f17754rotuma, exc, this.f17747dovishness.f27251dern, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.dern
    public boolean saneness() {
        naming.saneness.attabal("ResourceCacheGenerator.startNext");
        try {
            List<maggot.saneness> listDern = this.f17746arytenoidectomy.dern();
            boolean z = false;
            if (listDern.isEmpty()) {
                naming.saneness.marial();
                return false;
            }
            List<Class<?>> listImpassible = this.f17746arytenoidectomy.impassible();
            if (listImpassible.isEmpty()) {
                if (File.class.equals(this.f17746arytenoidectomy.polloi())) {
                    naming.saneness.marial();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f17746arytenoidectomy.taiyuan() + " to " + this.f17746arytenoidectomy.polloi());
            }
            while (true) {
                if (this.f17749graveside != null && attabal()) {
                    this.f17747dovishness = null;
                    while (!z && attabal()) {
                        List<kowloon<File, ?>> list = this.f17749graveside;
                        int i = this.f17745adultoid;
                        this.f17745adultoid = i + 1;
                        this.f17747dovishness = list.get(i).saneness(this.f17748gintrap, this.f17746arytenoidectomy.graveside(), this.f17746arytenoidectomy.beachfront(), this.f17746arytenoidectomy.apical());
                        if (this.f17747dovishness != null && this.f17746arytenoidectomy.adultoid(this.f17747dovishness.f27251dern.attabal())) {
                            this.f17747dovishness.f27251dern.marial(this.f17746arytenoidectomy.formularize(), this);
                            z = true;
                        }
                    }
                    naming.saneness.marial();
                    return z;
                }
                int i2 = this.f17753polloi + 1;
                this.f17753polloi = i2;
                if (i2 >= listImpassible.size()) {
                    int i3 = this.f17752monoploid + 1;
                    this.f17752monoploid = i3;
                    if (i3 >= listDern.size()) {
                        naming.saneness.marial();
                        return false;
                    }
                    this.f17753polloi = 0;
                }
                maggot.saneness sanenessVar = listDern.get(this.f17752monoploid);
                Class<?> cls = listImpassible.get(this.f17753polloi);
                this.f17754rotuma = new endosteum.apical(this.f17746arytenoidectomy.saneness(), sanenessVar, this.f17746arytenoidectomy.arytenoidectomy(), this.f17746arytenoidectomy.graveside(), this.f17746arytenoidectomy.beachfront(), this.f17746arytenoidectomy.molybdenite(cls), cls, this.f17746arytenoidectomy.apical());
                File fileAttabal = this.f17746arytenoidectomy.wireman().attabal(this.f17754rotuma);
                this.f17748gintrap = fileAttabal;
                if (fileAttabal != null) {
                    this.f17751molybdenite = sanenessVar;
                    this.f17749graveside = this.f17746arytenoidectomy.cutely(fileAttabal);
                    this.f17745adultoid = 0;
                }
            }
        } catch (Throwable th) {
            naming.saneness.marial();
            throw th;
        }
    }
}
