package com.legacy.sifarish.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.legacy.sifarish.R;
import com.legacy.sifarish.interfaces.IQuestionCallback;

/**
 * A placeholder fragment containing a simple view.
 */
public class Question2 extends IQuestionCallback{

    public Question2() {
    }
    Spinner spinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question_2, container, false);
        spinner = (Spinner) view.findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.clothing_professional, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        return view;
    }

    @Override
    public String getAnswer(){
        return spinner.getSelectedItem().toString();
    }
}
