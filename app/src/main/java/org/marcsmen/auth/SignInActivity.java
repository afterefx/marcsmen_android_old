package org.marcsmen.auth;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import timber.log.Timber;

public class SignInActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        Timber.tag(SignInActivity.class.getSimpleName());
        mAuth = FirebaseAuth.getInstance();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {
                    // User is signed in

                    Timber.d("onAuthStateChanged: signed_in: %s", user.getUid());

                } else {
                    // User is signed out
                    Timber.d("onAuthStateChanged: signed_out: ");
                }
            }
        };

        mAuth.addAuthStateListener(mAuthListener);
    }
}
