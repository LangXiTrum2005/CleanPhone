package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlobalLibraryVersionRegistrar f20905b;

    public DefaultUserAgentPublisher(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f20904a = b(set);
        this.f20905b = globalLibraryVersionRegistrar;
    }

    public static Component a() {
        Component.Builder builderB = Component.b(UserAgentPublisher.class);
        builderB.a(new Dependency(2, 0, LibraryVersion.class));
        builderB.f = new a();
        return builderB.b();
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion libraryVersion = (LibraryVersion) it.next();
            sb.append(libraryVersion.a());
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(libraryVersion.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public final String getUserAgent() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = this.f20905b;
        synchronized (globalLibraryVersionRegistrar.f20907a) {
            setUnmodifiableSet = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f20907a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f20904a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (globalLibraryVersionRegistrar.f20907a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f20907a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
