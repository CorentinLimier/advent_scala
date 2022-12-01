import days01.main

@main def main(args: String*) =
    if args.length == 0 then throw new Exception("require argument day")
    args(0) match {
        case "01" => days01.main()
        case _ => throw new Exception("day not supported")
    }
