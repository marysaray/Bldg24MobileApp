package com.example.bldg24mobileapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.navigation.findNavController

class ProgramsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_programs,
            container, false)
        val showMapView = view.findViewById<Button>(R.id.buttonViewMapId)
        showMapView.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_programsFragment_to_mapFragment)
        }
        val programInfo = view.findViewById<Button>(R.id.buttonShowProgramsInfo)
        programInfo.setOnClickListener {
            val programListView = view.findViewById<Spinner>(R.id.spinnerProgramsListId)
            val programItem = programListView.selectedItem
            val programClassName = getPrograms(programItem.toString())
            val programValues = programClassName.reduce {str, item -> str + '\n' + item}
            val programDescription = view.findViewById<TextView>(R.id.textViewProgramInfo)
            programDescription.text = programValues
        }
        return view
    }
   private fun getPrograms(program: String) : List<String> {
        return when (program) {
            "Computer Programming" -> listOf("Why Choose the Computer Programming Program?\n"
                , "Computer Programming is challenging, fun, and can change the world. " +
                    "Technology is an integral part of every person's life, and every business runs on software.\n\n" +
                    "If you like technology, solving problems and learning and want a career field that's growing " +
                    "and will be around for a very long time then this program might be the perfect fit.")
            "Manufacturing Engineering Technologies" -> listOf("Why Choose the Manufacturing Engineering Technologies Program?\n"
                , "Graduates of the Manufacturing Engineering Technologies (MET) degree" +
                    " & certificate programs are industry-ready professionals with the knowledge" +
                    " & skills to increase domestic and global manufacturing efficiency.\n\n" +
                    "These skills focus on the entire manufacturing processes of components and assemblies throughout a factory, " +
                    "from raw material to finished products. To accomplish this, students will learn & practically-apply innovative" +
                    " manufacturing engineering techniques.")
            "Mechatronics" -> listOf("Why Choose the Mechatronics Program?\n"
                , "Mechatronics is a multidisciplinary field combining mechanical, " +
                    "electrical, telecommunications, control and computer engineering" +
                    "and focusing on the design and production of automated equipment.\n\n" +
                    "Trained mechatronics professionals design and drive the future of industry, " +
                    "as mechatronics systems form the backbone of every computer-controlled machine " +
                    "and sophisticated consumer product. \n\n")
            "Nondestructive Testing" -> listOf("Why Choose the Nondestructive Testing Program?\n"
                , "Nondestructive testing is a valuable process used in fields such as construction," +
                    "manufacturing, civil engineering and transportation because it does not impair the usefulness" +
                    "of the object being inspected.\n\n" +
                    "Nondestructive testing techniques are used to examine structures or vehicles such as bridges, " +
                    "dams, pipelines, aircraft, trains and nuclear reactors.\n\n" +
                    "Our NDT program provides training in a variety of these analysis techniques used to evaluate the properties" +
                    "of a material or structure without causing damage.")
            "Network Operations and System Security" -> listOf("Why Choose the Network Operations & System Security (NOSS) Program? \n "
                ,   "The NOSS program prepares students to pursue careers " +
                    "in a variety of entry- to mid-level positions including, " +
                    "but not limited to, help desk, network system administration, and cyber security.\n\n" +
                    "Students prepare for careers involving the protection of information" +
                    "on computers and networks against unauthorized access or modification" +
                    "of information and the denial of service to authorized users.")
            else -> listOf("Please choose an option"
                , "You can learn more about different programs in Building 24 or view the current floor plan.")
        }
    }
}