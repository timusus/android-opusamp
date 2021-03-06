package net.opusapp.player.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.opusapp.player.R;
import net.opusapp.player.ui.activities.settings.FirstRunActivity;

public class SetupWelcomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_first_run, container, false);

        final View next = view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Activity activity = getActivity();

                if (activity != null) {
                    ((FirstRunActivity)activity).updateFragment(new SetupPathsFragment());
                }
            }
        });

        return view;
    }
}
