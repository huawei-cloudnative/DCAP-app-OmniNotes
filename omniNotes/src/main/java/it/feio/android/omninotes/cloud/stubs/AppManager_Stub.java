/*
 * Stub for class it.feio.android.omninotes.cloud.AppManager
 * Generated by Sapphire Compiler (sc).
 */
package it.feio.android.omninotes.cloud.stubs;


public final class AppManager_Stub extends it.feio.android.omninotes.cloud.AppManager implements sapphire.common.AppObjectStub {

    sapphire.policy.SapphirePolicy.SapphireClientPolicy $__client = null;
    boolean $__directInvocation = false;

    public AppManager_Stub () {
        super();
    }


    public void $__initialize(sapphire.policy.SapphirePolicy.SapphireClientPolicy client) {
        $__client = client;
    }

    public void $__initialize(boolean directInvocation) {
        $__directInvocation = directInvocation;
    }

    public Object $__clone() throws CloneNotSupportedException {
        return super.clone();
    }



    // Implementation of setMemo(String)
    public void setMemo(java.lang.String $param_String_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.setMemo( $param_String_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void it.feio.android.omninotes.cloud.AppManager.setMemo(java.lang.String)";
                $__params.add($param_String_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of getMemo()
    public java.lang.String getMemo() {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getMemo();
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public java.lang.String it.feio.android.omninotes.cloud.AppManager.getMemo()";
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ((java.lang.String) $__result);
    }

    // Implementation of getDbHelper()
    public it.feio.android.omninotes.db.DbHelper getDbHelper() {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getDbHelper();
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public it.feio.android.omninotes.db.DbHelper it.feio.android.omninotes.cloud.AppManager.getDbHelper()";
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ((it.feio.android.omninotes.db.DbHelper) $__result);
    }
}
