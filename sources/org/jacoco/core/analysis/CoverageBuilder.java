package org.jacoco.core.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jacoco.core.internal.analysis.BundleCoverageImpl;
import org.jacoco.core.internal.analysis.SourceFileCoverageImpl;

/* JADX INFO: loaded from: classes5.dex */
public class CoverageBuilder implements ICoverageVisitor {
    private final Map<String, IClassCoverage> classes = new HashMap();
    private final Map<String, ISourceFileCoverage> sourcefiles = new HashMap();

    private SourceFileCoverageImpl getSourceFile(String str, String str2) {
        String str3 = str2 + '/' + str;
        SourceFileCoverageImpl sourceFileCoverageImpl = (SourceFileCoverageImpl) this.sourcefiles.get(str3);
        if (sourceFileCoverageImpl != null) {
            return sourceFileCoverageImpl;
        }
        SourceFileCoverageImpl sourceFileCoverageImpl2 = new SourceFileCoverageImpl(str, str2);
        this.sourcefiles.put(str3, sourceFileCoverageImpl2);
        return sourceFileCoverageImpl2;
    }

    public IBundleCoverage getBundle(String str) {
        return new BundleCoverageImpl(str, this.classes.values(), this.sourcefiles.values());
    }

    public Collection<IClassCoverage> getClasses() {
        return Collections.unmodifiableCollection(this.classes.values());
    }

    public Collection<IClassCoverage> getNoMatchClasses() {
        ArrayList arrayList = new ArrayList();
        for (IClassCoverage iClassCoverage : this.classes.values()) {
            if (iClassCoverage.isNoMatch()) {
                arrayList.add(iClassCoverage);
            }
        }
        return arrayList;
    }

    public Collection<ISourceFileCoverage> getSourceFiles() {
        return Collections.unmodifiableCollection(this.sourcefiles.values());
    }

    @Override // org.jacoco.core.analysis.ICoverageVisitor
    public void visitCoverage(IClassCoverage iClassCoverage) {
        String name = iClassCoverage.getName();
        IClassCoverage iClassCoveragePut = this.classes.put(name, iClassCoverage);
        if (iClassCoveragePut == null) {
            String sourceFileName = iClassCoverage.getSourceFileName();
            if (sourceFileName != null) {
                getSourceFile(sourceFileName, iClassCoverage.getPackageName()).increment((ISourceNode) iClassCoverage);
                return;
            }
            return;
        }
        if (iClassCoveragePut.getId() == iClassCoverage.getId()) {
            return;
        }
        throw new IllegalStateException("Can't add different class with same name: " + name);
    }
}
