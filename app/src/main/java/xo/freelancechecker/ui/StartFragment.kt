package xo.freelancechecker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import xo.freelancechecker.MainActivity
import xo.freelancechecker.R
import xo.freelancechecker.databinding.FragmentStartBinding
import xo.freelancechecker.utils.APP_ACTIVITY

class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        _binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        mBinding.buttonSearch.setOnClickListener {
            APP_ACTIVITY.mNavController.navigate(R.id.action_startFragment_to_mainFragment)
            APP_ACTIVITY.title = "Список задач"
        }
    }
}