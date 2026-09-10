package hint;

import inblowing.monoploid;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: DefaultUserAgentPublisher.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern implements taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f27730attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f27731saneness;

    public dern(Set<beachfront> set, wireman wiremanVar) {
        this.f27730attabal = dern(set);
        this.f27731saneness = wiremanVar;
    }

    public static /* synthetic */ taiyuan attabal(inblowing.wireman wiremanVar) {
        return new dern(wiremanVar.wireman(beachfront.class), wireman.attabal());
    }

    public static String dern(Set<beachfront> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<beachfront> it = set.iterator();
        while (it.hasNext()) {
            beachfront next = it.next();
            sb.append(next.saneness());
            sb.append('/');
            sb.append(next.dern());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static inblowing.dern<taiyuan> saneness() {
        return inblowing.dern.marial(taiyuan.class).saneness(monoploid.kowloon(beachfront.class)).beachfront(new inblowing.competently() { // from class: hint.saneness
            @Override // inblowing.competently
            public final Object attabal(inblowing.wireman wiremanVar) {
                return dern.attabal(wiremanVar);
            }
        }).wireman();
    }

    @Override // hint.taiyuan
    public String getUserAgent() {
        if (this.f27731saneness.saneness().isEmpty()) {
            return this.f27730attabal;
        }
        return this.f27730attabal + ' ' + dern(this.f27731saneness.saneness());
    }
}
