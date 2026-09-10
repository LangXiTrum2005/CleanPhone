package com.badlogic.gdx.graphics.g3d.decals;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.SortedIntList;

/* JADX INFO: loaded from: classes.dex */
public class DecalBatch implements Disposable {
    private static final int DEFAULT_SIZE = 1000;
    private final SortedIntList<Array<Decal>> groupList;
    private final Pool<Array<Decal>> groupPool;
    private GroupStrategy groupStrategy;
    private Mesh mesh;
    private final Array<Array<Decal>> usedGroups;
    private float[] vertices;

    public DecalBatch(GroupStrategy groupStrategy) {
        this(1000, groupStrategy);
    }

    public void add(Decal decal) {
        int iDecideGroup = this.groupStrategy.decideGroup(decal);
        Array<Decal> arrayObtain = this.groupList.get(iDecideGroup);
        if (arrayObtain == null) {
            arrayObtain = this.groupPool.obtain();
            arrayObtain.clear();
            this.usedGroups.add(arrayObtain);
            this.groupList.insert(iDecideGroup, arrayObtain);
        }
        arrayObtain.add(decal);
    }

    public void clear() {
        this.groupList.clear();
        this.groupPool.freeAll(this.usedGroups);
        this.usedGroups.clear();
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        clear();
        this.vertices = null;
        this.mesh.dispose();
    }

    public void flush() {
        render();
        clear();
    }

    public int getSize() {
        return this.vertices.length / 24;
    }

    public void initialize(int i) {
        int i2 = 0;
        this.vertices = new float[i * 24];
        Mesh.VertexDataType vertexDataType = Mesh.VertexDataType.VertexArray;
        if (Gdx.gl30 != null) {
            vertexDataType = Mesh.VertexDataType.VertexBufferObjectWithVAO;
        }
        int i3 = i * 4;
        int i4 = i * 6;
        this.mesh = new Mesh(vertexDataType, false, i3, i4, new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(4, 4, ShaderProgram.COLOR_ATTRIBUTE), new VertexAttribute(16, 2, "a_texCoord0"));
        short[] sArr = new short[i4];
        int i5 = 0;
        while (i2 < i4) {
            sArr[i2] = (short) i5;
            short s = (short) (i5 + 2);
            sArr[i2 + 1] = s;
            short s2 = (short) (i5 + 1);
            sArr[i2 + 2] = s2;
            sArr[i2 + 3] = s2;
            sArr[i2 + 4] = s;
            sArr[i2 + 5] = (short) (i5 + 3);
            i2 += 6;
            i5 += 4;
        }
        this.mesh.setIndices(sArr);
    }

    public void render() {
        this.groupStrategy.beforeGroups();
        for (SortedIntList.Node<Array<Decal>> node : this.groupList) {
            this.groupStrategy.beforeGroup(node.index, node.value);
            render(this.groupStrategy.getGroupShader(node.index), node.value);
            this.groupStrategy.afterGroup(node.index);
        }
        this.groupStrategy.afterGroups();
    }

    public void setGroupStrategy(GroupStrategy groupStrategy) {
        this.groupStrategy = groupStrategy;
    }

    public DecalBatch(int i, GroupStrategy groupStrategy) {
        this.groupList = new SortedIntList<>();
        this.groupPool = new Pool<Array<Decal>>(16) { // from class: com.badlogic.gdx.graphics.g3d.decals.DecalBatch.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public Array<Decal> newObject() {
                return new Array<>(false, 100);
            }
        };
        this.usedGroups = new Array<>(16);
        initialize(i);
        setGroupStrategy(groupStrategy);
    }

    public void flush(ShaderProgram shaderProgram, int i) {
        this.mesh.setVertices(this.vertices, 0, i);
        this.mesh.render(shaderProgram, 4, 0, i / 4);
    }

    private void render(ShaderProgram shaderProgram, Array<Decal> array) {
        int length;
        Array.ArrayIterator<Decal> it = array.iterator();
        DecalMaterial decalMaterial = null;
        loop0: while (true) {
            length = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                Decal next = it.next();
                if (decalMaterial == null || !decalMaterial.equals(next.getMaterial())) {
                    if (length > 0) {
                        flush(shaderProgram, length);
                        length = 0;
                    }
                    next.material.set();
                    decalMaterial = next.material;
                }
                next.update();
                float[] fArr = next.vertices;
                System.arraycopy(fArr, 0, this.vertices, length, fArr.length);
                length += next.vertices.length;
            } while (length != this.vertices.length);
            flush(shaderProgram, length);
        }
        if (length > 0) {
            flush(shaderProgram, length);
        }
    }
}
