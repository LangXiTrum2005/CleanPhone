package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSet.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gusty<E> extends underbelly<E> implements Set<E> {
    @Override // com.google.common.collect.underbelly, com.google.common.collect.igbo
    /* JADX INFO: renamed from: delegate */
    public abstract Set<E> wireman();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || wireman().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return wireman().hashCode();
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return Sets.attabal(this, obj);
    }

    public int standardHashCode() {
        return Sets.wireman(this);
    }

    @Override // com.google.common.collect.underbelly
    public boolean standardRemoveAll(Collection<?> collection2) {
        return Sets.cutely(this, (Collection) com.google.common.base.formularize.triweekly(collection2));
    }
}
