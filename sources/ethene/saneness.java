package ethene;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements androidx.media3.exoplayer.source.arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cybernatic.adultoid f26063attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public cybernatic.monoploid f26064dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public cybernatic.arytenoidectomy f26065saneness;

    public saneness(cybernatic.adultoid adultoidVar) {
        this.f26063attabal = adultoidVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // androidx.media3.exoplayer.source.arytenoidectomy
    public void attabal(androidx.media3.common.taiyuan taiyuanVar, Uri uri, Map<String, List<String>> map, long j, long j2, cybernatic.polloi polloiVar) throws IOException {
        cybernatic.taiyuan taiyuanVar2 = new cybernatic.taiyuan(taiyuanVar, j, j2);
        this.f26064dern = taiyuanVar2;
        if (this.f26065saneness != null) {
            return;
        }
        cybernatic.arytenoidectomy[] arytenoidectomyVarArrDern = this.f26063attabal.dern(uri, map);
        ImmutableList.attabal attabalVarBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(arytenoidectomyVarArrDern.length);
        if (arytenoidectomyVarArrDern.length == 1) {
            this.f26065saneness = arytenoidectomyVarArrDern[0];
        } else {
            for (cybernatic.arytenoidectomy arytenoidectomyVar : arytenoidectomyVarArrDern) {
                try {
                    if (arytenoidectomyVar.attabal(taiyuanVar2)) {
                        this.f26065saneness = arytenoidectomyVar;
                        decarock.attabal.competently(true);
                        taiyuanVar2.resetPeekPosition();
                        break;
                    } else {
                        attabalVarBuilderWithExpectedSize.apical(arytenoidectomyVar.wireman());
                        boolean z = this.f26065saneness != null || taiyuanVar2.getPosition() == j;
                        decarock.attabal.competently(z);
                        taiyuanVar2.resetPeekPosition();
                    }
                } catch (EOFException unused) {
                    if (this.f26065saneness != null || taiyuanVar2.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    decarock.attabal.competently(this.f26065saneness != null || taiyuanVar2.getPosition() == j);
                    taiyuanVar2.resetPeekPosition();
                    throw th;
                }
                decarock.attabal.competently(z);
                taiyuanVar2.resetPeekPosition();
            }
            if (this.f26065saneness == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + com.google.common.base.beachfront.competently(", ").wireman(Lists.apical(ImmutableList.copyOf(arytenoidectomyVarArrDern), new com.google.common.base.marial() { // from class: ethene.attabal
                    @Override // com.google.common.base.marial
                    public final Object apply(Object obj) {
                        return ((cybernatic.arytenoidectomy) obj).saneness().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) decarock.attabal.marial(uri), attabalVarBuilderWithExpectedSize.impassible());
            }
        }
        this.f26065saneness.marial(polloiVar);
    }

    @Override // androidx.media3.exoplayer.source.arytenoidectomy
    public void dern() {
        cybernatic.arytenoidectomy arytenoidectomyVar = this.f26065saneness;
        if (arytenoidectomyVar == null) {
            return;
        }
        cybernatic.arytenoidectomy arytenoidectomyVarSaneness = arytenoidectomyVar.saneness();
        if (arytenoidectomyVarSaneness instanceof balance.beachfront) {
            ((balance.beachfront) arytenoidectomyVarSaneness).apical();
        }
    }

    @Override // androidx.media3.exoplayer.source.arytenoidectomy
    public void release() {
        cybernatic.arytenoidectomy arytenoidectomyVar = this.f26065saneness;
        if (arytenoidectomyVar != null) {
            arytenoidectomyVar.release();
            this.f26065saneness = null;
        }
        this.f26064dern = null;
    }

    @Override // androidx.media3.exoplayer.source.arytenoidectomy
    public int saneness(cybernatic.restrictive restrictiveVar) throws IOException {
        return ((cybernatic.arytenoidectomy) decarock.attabal.marial(this.f26065saneness)).beachfront((cybernatic.monoploid) decarock.attabal.marial(this.f26064dern), restrictiveVar);
    }

    @Override // androidx.media3.exoplayer.source.arytenoidectomy
    public void seek(long j, long j2) {
        ((cybernatic.arytenoidectomy) decarock.attabal.marial(this.f26065saneness)).seek(j, j2);
    }

    @Override // androidx.media3.exoplayer.source.arytenoidectomy
    public long wireman() {
        cybernatic.monoploid monoploidVar = this.f26064dern;
        if (monoploidVar != null) {
            return monoploidVar.getPosition();
        }
        return -1L;
    }
}
